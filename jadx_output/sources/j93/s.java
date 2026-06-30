package j93;

/* loaded from: classes11.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.w f298491a;

    public s(j93.w wVar) {
        this.f298491a = wVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.modelbase.m1 m1Var = fVar.f70619e;
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436684m, vg3.b.f436646f, vg3.c.f436668w, fVar.f70616b, null, 16, null));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.c4 c4Var = (r45.c4) fVar.f70618d;
            java.util.LinkedList linkedList = c4Var.f371260e;
            j93.w wVar = this.f298491a;
            if (linkedList == null || linkedList.size() <= 0) {
                androidx.appcompat.app.AppCompatActivity context = wVar.getActivity();
                com.tencent.mm.ui.widget.dialog.f4 f4Var = wVar.f298525d;
                java.lang.String string = wVar.getActivity().getString(com.tencent.mm.R.string.f489827cv);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                kotlin.jvm.internal.o.g(context, "context");
                if (f4Var != null) {
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = f4Var.f211791d;
                    e4Var.getClass();
                    e4Var.f211776c = string;
                    e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                    e4Var.e();
                } else {
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var2.f211776c = string;
                    e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
                    e4Var2.c();
                }
            } else {
                r45.f54 f54Var = (r45.f54) linkedList.get(0);
                java.lang.String str = f54Var.f374021d;
                java.lang.String valueOf = java.lang.String.valueOf(f54Var.f374022e);
                com.tencent.mars.xlog.Log.i("MicroMsg.CreateNewLabelUIC", "[onSceneEnd] add label pair.LabelID:" + valueOf + " pair.LabelName:" + str);
                java.util.LinkedList linkedList2 = c4Var.f371260e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = linkedList2.size();
                for (int i18 = 0; i18 < size; i18++) {
                    r45.f54 f54Var2 = (r45.f54) linkedList2.get(i18);
                    com.tencent.mm.storage.d4 d4Var = new com.tencent.mm.storage.d4();
                    d4Var.field_labelID = f54Var2.f374022e;
                    java.lang.String str2 = f54Var2.f374021d;
                    d4Var.field_labelName = str2;
                    d4Var.field_labelPYFull = x51.k.a(str2);
                    d4Var.field_labelPYShort = x51.k.b(f54Var2.f374021d);
                    d4Var.field_isTemporary = false;
                    arrayList.add(d4Var);
                }
                b93.r.wi().W0(arrayList);
                b93.r.wi().T1(arrayList);
                com.tencent.mm.ui.widget.dialog.f4 f4Var2 = wVar.f298525d;
                if (f4Var2 != null) {
                    f4Var2.dismiss();
                }
                f93.q5 q5Var = f93.q5.f260441a;
                androidx.appcompat.app.AppCompatActivity activity = wVar.getActivity();
                kotlin.jvm.internal.o.d(str);
                q5Var.d(activity, valueOf, str);
            }
        }
        return jz5.f0.f302826a;
    }
}
