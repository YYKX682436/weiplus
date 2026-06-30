package com.tencent.thumbplayer.api.connection;

/* loaded from: classes15.dex */
public class TPPlayerConnectionNode {
    private com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode nativeNode = new com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode();

    public boolean addAction(@com.tencent.thumbplayer.api.connection.TPPlayerConnectionConstant.Action int i17) {
        return this.nativeNode.addAction(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionAction.class, i17));
    }

    public com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode getNativeNode() {
        return this.nativeNode;
    }

    public void removeAction(@com.tencent.thumbplayer.api.connection.TPPlayerConnectionConstant.Action int i17) {
        this.nativeNode.removeAction(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionAction.class, i17));
    }

    public boolean setLongActionConfig(@com.tencent.thumbplayer.api.connection.TPPlayerConnectionConstant.Action int i17, int i18, long j17) {
        return this.nativeNode.setLongActionConfig(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionAction.class, i17), com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionConfig.class, i18), j17);
    }
}
