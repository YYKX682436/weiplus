package com.tencent.wechat.aff.finder;

/* loaded from: classes8.dex */
public class FinderPrefetchManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.finder.FinderPrefetchManager instance = new com.tencent.wechat.aff.finder.FinderPrefetchManager();

    public FinderPrefetchManager() {
        createClientInvoker("finder.FinderPrefetchManager@Get", null);
    }

    public static com.tencent.wechat.aff.finder.FinderPrefetchManager getInstance() {
        return instance;
    }

    public boolean canShowEduTipsWithKey(bw5.ms0 ms0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("canShowEduTipsWithKey");
            invokerCodecEncoder.writeInt32(ms0Var.f30382d);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.canShowEduTipsWithKey failed", e17);
        }
    }

    public boolean hasEnoughValidLocalFeeds(bw5.qs0 qs0Var, bw5.os0 os0Var, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("hasEnoughValidLocalFeeds");
            invokerCodecEncoder.writeInt32(qs0Var.f32279d);
            invokerCodecEncoder.writeInt32(os0Var.f31385d);
            invokerCodecEncoder.writeUInt32(i17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.hasEnoughValidLocalFeeds failed", e17);
        }
    }

    public void init(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.init failed", e17);
        }
    }

    public java.util.ArrayList<com.tencent.wechat.aff.finder.FinderObjectWrap> localFeedArray(bw5.qs0 qs0Var, bw5.os0 os0Var, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("localFeedArray");
            invokerCodecEncoder.writeInt32(qs0Var.f32279d);
            invokerCodecEncoder.writeInt32(os0Var.f31385d);
            invokerCodecEncoder.writeUInt32(i17);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.finder.FinderObjectWrap.getDefaultInstance(), new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.localFeedArray failed", e17);
        }
    }

    public java.util.ArrayList<com.tencent.wechat.aff.finder.FinderObjectWrap> localFeedArrayWithFeedSource(long j17, bw5.os0 os0Var, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("localFeedArrayWithFeedSource");
            invokerCodecEncoder.writeUInt64(j17);
            invokerCodecEncoder.writeInt32(os0Var.f31385d);
            invokerCodecEncoder.writeUInt32(i17);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.finder.FinderObjectWrap.getDefaultInstance(), new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.localFeedArrayWithFeedSource failed", e17);
        }
    }

    public void markEduTipsNeverShowWithKey(bw5.ms0 ms0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("markEduTipsNeverShowWithKey");
            invokerCodecEncoder.writeInt32(ms0Var.f30382d);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.markEduTipsNeverShowWithKey failed", e17);
        }
    }

    public void markShowOnceEduTipsWithKey(bw5.ms0 ms0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("markShowOnceEduTipsWithKey");
            invokerCodecEncoder.writeInt32(ms0Var.f30382d);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.markShowOnceEduTipsWithKey failed", e17);
        }
    }

    public void removeAllLocalBackupFeeds() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("removeAllLocalBackupFeeds");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.removeAllLocalBackupFeeds failed", e17);
        }
    }

    public void removeLocalBackupFeeds(java.util.ArrayList<java.lang.String> arrayList) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("removeLocalBackupFeeds");
            invokerCodecEncoder.writeStringList(arrayList);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.removeLocalBackupFeeds failed", e17);
        }
    }

    public void resetEduTipsRecordWithKey(bw5.ms0 ms0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("resetEduTipsRecordWithKey");
            invokerCodecEncoder.writeInt32(ms0Var.f30382d);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.resetEduTipsRecordWithKey failed", e17);
        }
    }

    public void updateEduTipsSvrFlag(bw5.tr trVar) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateEduTipsSvrFlag");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(trVar));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.updateEduTipsSvrFlag failed", e17);
        }
    }

    public void updateLocalBackupFeed(java.util.ArrayList<com.tencent.wechat.aff.finder.FinderObjectWrap> arrayList, bw5.os0 os0Var, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateLocalBackupFeed");
            invokerCodecEncoder.writeBytesList(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(arrayList));
            invokerCodecEncoder.writeInt32(os0Var.f31385d);
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.updateLocalBackupFeed failed", e17);
        }
    }
}
