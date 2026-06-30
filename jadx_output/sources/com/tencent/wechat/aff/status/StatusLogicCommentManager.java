package com.tencent.wechat.aff.status;

/* loaded from: classes11.dex */
public class StatusLogicCommentManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.status.StatusLogicCommentManager instance = new com.tencent.wechat.aff.status.StatusLogicCommentManager();

    public StatusLogicCommentManager() {
        createClientInvoker("status.StatusLogicCommentManager@Get", null);
    }

    public static com.tencent.wechat.aff.status.StatusLogicCommentManager getInstance() {
        return instance;
    }

    public bw5.sl0 clearAllMessage() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearAllMessage");
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.clearAllMessage failed", e17);
        }
    }

    public bw5.sl0 deleteComment(java.lang.String str, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteComment");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt64(j17);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.deleteComment failed", e17);
        }
    }

    public bw5.sl0 deleteLikeData(java.lang.String str, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteLikeData");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt64(j17);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.deleteLikeData failed", e17);
        }
    }

    public bw5.sl0 deleteMessage(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteMessage");
            invokerCodecEncoder.writeString(str);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.deleteMessage failed", e17);
        }
    }

    public bw5.sl0 getAllMessage(bw5.rl0 rl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllMessage");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(rl0Var));
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getAllMessage failed", e17);
        }
    }

    public bw5.sl0 getAllTextStatusLike(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllTextStatusLike");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt32(i17);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getAllTextStatusLike failed", e17);
        }
    }

    public bw5.sl0 getCommentMessage(bw5.rl0 rl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getCommentMessage");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(rl0Var));
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getCommentMessage failed", e17);
        }
    }

    public bw5.sl0 getCommentNoSendSuccess(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getCommentNoSendSuccess");
            invokerCodecEncoder.writeString(str);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getCommentNoSendSuccess failed", e17);
        }
    }

    public bw5.sl0 getLikeDataByUserNameAndId(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getLikeDataByUserNameAndId");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getLikeDataByUserNameAndId failed", e17);
        }
    }

    public bw5.sl0 getLikeMessage(bw5.rl0 rl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getLikeMessage");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(rl0Var));
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getLikeMessage failed", e17);
        }
    }

    public bw5.sl0 getMessageByCondition(int i17, boolean z17, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getMessageByCondition");
            invokerCodecEncoder.writeInt32(i17);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeInt64(j17);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getMessageByCondition failed", e17);
        }
    }

    public int getMessageCount(bw5.rl0 rl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getMessageCount");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(rl0Var));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readInt32();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getMessageCount failed", e17);
        }
    }

    public int getNotReadNotifyCount() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getNotReadNotifyCount");
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readInt32();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.getNotReadNotifyCount failed", e17);
        }
    }

    public bw5.sl0 insertOrReplaceComment(bw5.pl0 pl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("insertOrReplaceComment");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(pl0Var));
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.insertOrReplaceComment failed", e17);
        }
    }

    public bw5.sl0 insertOrReplaceLikeData(bw5.pl0 pl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("insertOrReplaceLikeData");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(pl0Var));
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.insertOrReplaceLikeData failed", e17);
        }
    }

    public bw5.sl0 isLikeTextStatus(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("isLikeTextStatus");
            invokerCodecEncoder.writeString(str);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.isLikeTextStatus failed", e17);
        }
    }

    public bw5.sl0 markAllMessageRead() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("markAllMessageRead");
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.markAllMessageRead failed", e17);
        }
    }

    public bw5.sl0 markAllNotifyRead() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("markAllNotifyRead");
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.markAllNotifyRead failed", e17);
        }
    }

    public bw5.sl0 performSelfDoLike(java.lang.String str, boolean z17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("performSelfDoLike");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBoolean(z17);
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.performSelfDoLike failed", e17);
        }
    }

    public bw5.sl0 updateCommentSendState(bw5.pl0 pl0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateCommentSendState");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(pl0Var));
            return (bw5.sl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sl0.f33039i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusLogicCommentManager.updateCommentSendState failed", e17);
        }
    }
}
