package com.tencent.wechat.aff.status;

/* loaded from: classes11.dex */
public class StatusXmlParseManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.status.StatusXmlParseManager instance = new com.tencent.wechat.aff.status.StatusXmlParseManager();

    public StatusXmlParseManager() {
        createClientInvoker("status.StatusXmlParseManager@Get", null);
    }

    public static com.tencent.wechat.aff.status.StatusXmlParseManager getInstance() {
        return instance;
    }

    public bw5.sm0 createStatusInfoByHistory(bw5.gm0 gm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("createStatusInfoByHistory");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(gm0Var));
            return (bw5.sm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sm0.f33050u, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.createStatusInfoByHistory failed", e17);
        }
    }

    public bw5.ml0 dealCgiStatusModelData(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dealCgiStatusModelData");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            return (bw5.ml0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.ml0.f30280h, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.dealCgiStatusModelData failed", e17);
        }
    }

    public bw5.hn0 dealModTextXml(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dealModTextXml");
            invokerCodecEncoder.writeString(str);
            return (bw5.hn0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.hn0.f28285m, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.dealModTextXml failed", e17);
        }
    }

    public bw5.hn0 dealNewModifyStatusXml(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dealNewModifyStatusXml");
            invokerCodecEncoder.writeString(str);
            return (bw5.hn0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.hn0.f28285m, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.dealNewModifyStatusXml failed", e17);
        }
    }

    public bw5.wm0 dealStatusCommentMsgXml(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dealStatusCommentMsgXml");
            invokerCodecEncoder.writeString(str);
            return (bw5.wm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.wm0.f34784m, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.dealStatusCommentMsgXml failed", e17);
        }
    }

    public bw5.wm0 dealStatusLikeMsgXml(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dealStatusLikeMsgXml");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            return (bw5.wm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.wm0.f34784m, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.dealStatusLikeMsgXml failed", e17);
        }
    }

    public java.lang.String getHashUserNameByParseLikeMsgXml(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getHashUserNameByParseLikeMsgXml");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readString();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusXmlParseManager.getHashUserNameByParseLikeMsgXml failed", e17);
        }
    }
}
