package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class StatusLogicManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.status.StatusLogicManager instance = new com.tencent.wechat.aff.status.StatusLogicManager();

    public StatusLogicManager() {
        createClientInvoker("status.StatusLogicManager@Get", null);
    }

    public static com.tencent.wechat.aff.status.StatusLogicManager getInstance() {
        return instance;
    }

    public bw5.lm0 findValidStatusIconAction(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("findValidStatusIconAction");
            invokerCodecEncoder.writeString(str);
            return (bw5.lm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.lm0.f29860i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.findValidStatusIconAction failed", e17);
        }
    }

    public bw5.bm0 genStatusFeedMediaLocalFilePath(bw5.am0 am0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GenStatusFeedMediaLocalFilePath");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(am0Var));
            return (bw5.bm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.bm0.f25749h, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.genStatusFeedMediaLocalFilePath failed", e17);
        }
    }

    public bw5.qm0 getIcon(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getIcon");
            invokerCodecEncoder.writeString(str);
            return (bw5.qm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.qm0.f32187i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.getIcon failed", e17);
        }
    }

    public bw5.zm0 getStatusItemIconDescDataWithReq(bw5.ym0 ym0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetStatusItemIconDescDataWithReq");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(ym0Var));
            return (bw5.zm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.zm0.f36059i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.getStatusItemIconDescDataWithReq failed", e17);
        }
    }

    public java.lang.String getStatusName(bw5.sm0 sm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getStatusName");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(sm0Var));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readString();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.getStatusName failed", e17);
        }
    }

    public bw5.nn0 getStatusPublishIconGroupWithReq(bw5.mn0 mn0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetStatusPublishIconGroupWithReq");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(mn0Var));
            return (bw5.nn0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.nn0.f30749n, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.getStatusPublishIconGroupWithReq failed", e17);
        }
    }

    public bw5.un0 getTopicGroupListData(bw5.tn0 tn0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getTopicGroupListData");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(tn0Var));
            return (bw5.un0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.un0.f33999i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.getTopicGroupListData failed", e17);
        }
    }

    public void updateClusterPresentType(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateClusterPresentType");
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.updateClusterPresentType failed", e17);
        }
    }

    public void updateIconConfigList(bw5.nm0 nm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateIconConfigList");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(nm0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicManager.updateIconConfigList failed", e17);
        }
    }
}
