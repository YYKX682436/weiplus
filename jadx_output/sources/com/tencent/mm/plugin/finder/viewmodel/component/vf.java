package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vf extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final boolean O6() {
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.q0().r()).intValue() != 1) {
            return false;
        }
        return (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_INT, 0) < 2 && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_DIALOG_GUIDE_INT, 0) <= 0 && c01.id.a() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_LAST_TIME_LONG, 0L) > 172800000) || ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Kd).getValue()).r()).intValue() != 0;
    }

    public final boolean P6() {
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.q0().r()).intValue() != 1) {
            return false;
        }
        return (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_DIALOG_GUIDE_INT, 0) <= 0 && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_INT, 0) <= 0) || ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Kd).getValue()).r()).intValue() != 0;
    }
}
