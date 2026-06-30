package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class z8 extends com.tencent.mm.ui.component.UIComponent implements zy2.s8 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f117578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6() {
        java.lang.String string;
        android.widget.TextView textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f485625qg0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC;
        boolean z17 = (c17.t(u3Var, 0L) & 16) != 0;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        if ((z17 || (((gm0.j1.u().c().t(u3Var, 0L) & 32) > 0L ? 1 : ((gm0.j1.u().c().t(u3Var, 0L) & 32) == 0L ? 0 : -1)) != 0)) ? false : true) {
            string = getActivity().getString(com.tencent.mm.R.string.nqg);
            kotlin.jvm.internal.o.d(string);
        } else if (z17) {
            string = getActivity().getString(com.tencent.mm.R.string.nqc);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = getActivity().getString(com.tencent.mm.R.string.nqe);
            kotlin.jvm.internal.o.d(string);
        }
        textView.setText(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.z8.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        O6();
    }
}
