package gr2;

/* loaded from: classes2.dex */
public final class r0 implements oa.c {
    @Override // oa.c
    public void h0(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof gr2.q0) {
            gr2.q0 q0Var = (gr2.q0) obj;
            android.widget.TextView textView = q0Var.f274818c;
            if (textView != null) {
                android.view.View view = q0Var.f274817b.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f479252u4));
            }
            q0Var.a(false);
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof gr2.q0) {
            gr2.q0 q0Var = (gr2.q0) obj;
            android.widget.TextView textView = q0Var.f274818c;
            if (textView != null) {
                android.view.View view = q0Var.f274817b.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.aaz));
            }
            q0Var.a(true);
            com.tencent.mars.xlog.Log.i("Finder.ThemeTagListWidget", "onTabSelected position = " + t17.f343782e);
            com.tencent.mm.autogen.events.LiveThemeTagChangeEvent liveThemeTagChangeEvent = new com.tencent.mm.autogen.events.LiveThemeTagChangeEvent();
            int i17 = q0Var.f274820e;
            am.bj bjVar = liveThemeTagChangeEvent.f54478g;
            bjVar.f6258b = i17;
            bjVar.f6257a = 1;
            liveThemeTagChangeEvent.e();
        }
    }
}
