package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AssetReader implements com.tencent.tav.core.AssetReaderOutput.StatusListener {
    private com.tencent.tav.asset.Asset asset;
    private com.tencent.tav.core.IContextCreate contextCreate;
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    private com.tencent.tav.core.AVAssetReaderStatus status = com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusUnknown;
    private java.lang.String errMsg = "";
    private java.util.List<com.tencent.tav.core.AssetReaderOutput> outputs = new java.util.ArrayList();
    private java.util.HashMap<com.tencent.tav.core.AssetReaderOutput, com.tencent.tav.core.AVAssetReaderStatus> outputStatusHashMap = new java.util.HashMap<>();

    public AssetReader(com.tencent.tav.asset.Asset asset) {
        this.asset = asset;
    }

    private void updateAssetStatus() {
        java.util.Iterator<com.tencent.tav.core.AssetReaderOutput> it = this.outputs.iterator();
        boolean z17 = true;
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.outputStatusHashMap.get(it.next()) == com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusCompleted) {
                z18 = true;
            }
            z17 &= z18;
        }
        if (z17) {
            this.status = com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusCompleted;
            return;
        }
        boolean z19 = true;
        for (com.tencent.tav.core.AssetReaderOutput assetReaderOutput : this.outputs) {
            z19 &= this.outputStatusHashMap.get(assetReaderOutput) == com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusReading || this.outputStatusHashMap.get(assetReaderOutput) == com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusCompleted;
        }
        if (z19) {
            this.status = com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusReading;
            return;
        }
        java.util.Iterator<com.tencent.tav.core.AssetReaderOutput> it6 = this.outputs.iterator();
        while (it6.hasNext()) {
            com.tencent.tav.core.AVAssetReaderStatus aVAssetReaderStatus = this.outputStatusHashMap.get(it6.next());
            com.tencent.tav.core.AVAssetReaderStatus aVAssetReaderStatus2 = com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusFailed;
            if (aVAssetReaderStatus == aVAssetReaderStatus2) {
                this.status = aVAssetReaderStatus2;
                return;
            }
        }
        java.util.Iterator<com.tencent.tav.core.AssetReaderOutput> it7 = this.outputs.iterator();
        while (it7.hasNext()) {
            com.tencent.tav.core.AVAssetReaderStatus aVAssetReaderStatus3 = this.outputStatusHashMap.get(it7.next());
            com.tencent.tav.core.AVAssetReaderStatus aVAssetReaderStatus4 = com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusCancelled;
            if (aVAssetReaderStatus3 == aVAssetReaderStatus4) {
                this.status = aVAssetReaderStatus4;
                return;
            }
        }
    }

    public void addOutput(com.tencent.tav.core.AssetReaderOutput assetReaderOutput) {
        if (canAddOutput(assetReaderOutput)) {
            this.outputs.add(assetReaderOutput);
        }
    }

    public boolean canAddOutput(com.tencent.tav.core.AssetReaderOutput assetReaderOutput) {
        return (assetReaderOutput == null || this.outputs.contains(assetReaderOutput)) ? false : true;
    }

    public void cancelReading() {
        for (com.tencent.tav.core.AssetReaderOutput assetReaderOutput : this.outputs) {
            this.outputStatusHashMap.put(assetReaderOutput, com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusCancelled);
            assetReaderOutput.release();
        }
        updateAssetStatus();
    }

    public com.tencent.tav.asset.Asset getAsset() {
        return this.asset;
    }

    public java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public java.util.List<com.tencent.tav.core.AssetReaderOutput> getOutputs() {
        return this.outputs;
    }

    public com.tencent.tav.core.AVAssetReaderStatus getStatus() {
        return this.status;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public boolean startReading(com.tencent.tav.core.IContextCreate iContextCreate) {
        this.contextCreate = iContextCreate;
        for (com.tencent.tav.core.AssetReaderOutput assetReaderOutput : this.outputs) {
            this.outputStatusHashMap.put(assetReaderOutput, com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusReading);
            if (assetReaderOutput.mediaType == 1) {
                assetReaderOutput.start(iContextCreate, getTimeRange());
            } else {
                assetReaderOutput.start(null, getTimeRange());
            }
            assetReaderOutput.addStatusListener(this);
        }
        updateAssetStatus();
        return this.outputs.size() > 0;
    }

    @Override // com.tencent.tav.core.AssetReaderOutput.StatusListener
    public void statusChanged(com.tencent.tav.core.AssetReaderOutput assetReaderOutput, com.tencent.tav.core.AVAssetReaderStatus aVAssetReaderStatus) {
        this.outputStatusHashMap.put(assetReaderOutput, aVAssetReaderStatus);
        updateAssetStatus();
    }
}
