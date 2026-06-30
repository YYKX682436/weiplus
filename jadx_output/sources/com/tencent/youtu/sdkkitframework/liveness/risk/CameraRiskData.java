package com.tencent.youtu.sdkkitframework.liveness.risk;

/* loaded from: classes14.dex */
public class CameraRiskData {
    public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> image_list;
    public java.lang.String stage_name;
    public int state;
    public int ui_end_delay;
    public int ui_start_delay;

    /* loaded from: classes14.dex */
    public static class RiskData {
        public java.lang.String checksum;
        public java.lang.String image;
        public java.lang.String image_name;
        public float key1;
        public int key2;
        public int key3;
        public long key4;
        public java.util.ArrayList<java.lang.Integer> task_type;
        public long timestamp;

        public java.lang.String getChecksum() {
            return this.checksum;
        }

        public java.lang.String getImage() {
            return this.image;
        }

        public java.lang.String getImage_name() {
            return this.image_name;
        }

        public float getKey1() {
            return this.key1;
        }

        public int getKey2() {
            return this.key2;
        }

        public int getKey3() {
            return this.key3;
        }

        public long getKey4() {
            return this.key4;
        }

        public java.util.ArrayList<java.lang.Integer> getTask_type() {
            return this.task_type;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public void setChecksum(java.lang.String str) {
            this.checksum = str;
        }

        public void setImage(java.lang.String str) {
            this.image = str;
        }

        public void setImage_name(java.lang.String str) {
            this.image_name = str;
        }

        public void setKey1(float f17) {
            this.key1 = f17;
        }

        public void setKey2(int i17) {
            this.key2 = i17;
        }

        public void setKey3(int i17) {
            this.key3 = i17;
        }

        public void setKey4(long j17) {
            this.key4 = j17;
        }

        public void setTask_type(java.util.ArrayList<java.lang.Integer> arrayList) {
            this.task_type = arrayList;
        }

        public void setTimestamp(long j17) {
            this.timestamp = j17;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData m428clone() {
            com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData = new com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData();
            riskData.image_name = this.image_name;
            riskData.key1 = this.key1;
            riskData.key2 = this.key2;
            riskData.key3 = this.key3;
            riskData.key4 = this.key4;
            riskData.task_type = this.task_type;
            return riskData;
        }
    }

    /* loaded from: classes14.dex */
    public enum StageName {
        stage_start(1),
        stage_reflect(2),
        stage_end(3);

        private static java.util.HashMap<java.lang.Integer, com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName> map = new java.util.HashMap<>();
        public int value;

        static {
            for (com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName stageName : values()) {
                map.put(java.lang.Integer.valueOf(stageName.value), stageName);
            }
        }

        StageName(int i17) {
            this.value = i17;
        }
    }

    public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> getImage_list() {
        return this.image_list;
    }

    public java.lang.String getStage_name() {
        return this.stage_name;
    }

    public int getUi_end_delay() {
        return this.ui_end_delay;
    }

    public int getUi_start_delay() {
        return this.ui_start_delay;
    }

    public void setImage_list(java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> arrayList) {
        this.image_list = arrayList;
    }

    public void setStage_name(java.lang.String str) {
        this.stage_name = str;
    }

    public void setUi_end_delay(int i17) {
        this.ui_end_delay = i17;
    }

    public void setUi_start_delay(int i17) {
        this.ui_start_delay = i17;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData m427clone() {
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData cameraRiskData = new com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData();
        cameraRiskData.stage_name = this.stage_name;
        cameraRiskData.ui_start_delay = this.ui_start_delay;
        cameraRiskData.ui_end_delay = this.ui_end_delay;
        if (this.image_list != null) {
            cameraRiskData.image_list = new java.util.ArrayList<>();
            java.util.Iterator<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> it = this.image_list.iterator();
            while (it.hasNext()) {
                cameraRiskData.image_list.add(it.next().m428clone());
            }
        }
        return cameraRiskData;
    }
}
