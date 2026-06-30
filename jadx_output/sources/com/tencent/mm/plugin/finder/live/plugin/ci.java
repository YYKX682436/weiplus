package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ci extends com.tencent.mm.plugin.finder.live.plugin.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(android.view.ViewGroup emptyFrameLayout, qo0.c statusMonitor) {
        super(emptyFrameLayout, statusMonitor, null);
        kotlin.jvm.internal.o.g(emptyFrameLayout, "emptyFrameLayout");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        java.lang.String str = string != null ? string : "";
        switch (str.hashCode()) {
            case -1394759506:
                if (str.equals("PORTRAIT_ACTION_DISPATCH_JUMP")) {
                    com.tencent.mm.plugin.finder.live.plugin.bi biVar = new com.tencent.mm.plugin.finder.live.plugin.bi(obj, this);
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(biVar, j17);
                    return;
                }
                return;
            case 287584941:
                if (str.equals("PORTRAIT_ACTION_CART_CLICKED")) {
                    com.tencent.mm.plugin.finder.live.plugin.ai aiVar = new com.tencent.mm.plugin.finder.live.plugin.ai(this);
                    java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(aiVar, j17);
                    return;
                }
                return;
            case 480324394:
                if (str.equals("PORTRAIT_ACTION_HALF_SCREEN_MINIPRO") && X0(com.tencent.mm.plugin.finder.live.plugin.ga0.class) == null) {
                    com.tencent.mm.plugin.finder.live.plugin.zh zhVar = new com.tencent.mm.plugin.finder.live.plugin.zh(this, obj, j17);
                    java.util.regex.Pattern pattern3 = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(zhVar, j17);
                    return;
                }
                return;
            case 639452494:
                if (str.equals("PORTRAIT_ACTION_FULL_SCREEN_MINIPRO") && X0(com.tencent.mm.plugin.finder.live.plugin.ga0.class) == null) {
                    com.tencent.mm.plugin.finder.live.plugin.yh yhVar = new com.tencent.mm.plugin.finder.live.plugin.yh(this, obj, j17);
                    java.util.regex.Pattern pattern4 = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(yhVar, j17);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }
}
