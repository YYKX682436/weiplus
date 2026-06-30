package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class aq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.aq f126480d = new com.tencent.mm.plugin.finder.storage.aq();

    public aq() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.app.Activity activity = (android.app.Activity) obj;
        if (activity != null) {
            i95.m c17 = i95.n0.c(zy2.ca.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                f0Var.f310116d = -2;
                android.widget.EditText editText = new android.widget.EditText(activity);
                editText.setHint("maxWidth\n(default:WRAP_CONTENT)");
                editText.setInputType(2);
                editText.addTextChangedListener(new oc2.d(f0Var));
                u1Var.u("json to dsl");
                u1Var.f(java.lang.Boolean.TRUE);
                u1Var.o("json");
                u1Var.d(editText);
                u1Var.b(new oc2.b(f0Var, activity));
                u1Var.q(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
