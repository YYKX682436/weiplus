package kr3;

/* loaded from: classes11.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f311491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kr3.q0 q0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f311490d = q0Var;
        this.f311491e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        kr3.q0 q0Var = this.f311490d;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = q0Var.getIntent().getStringArrayListExtra("key_intent_assemble_uic_list");
        if (stringArrayListExtra != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Class.forName((java.lang.String) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (com.tencent.mm.storage.z3.m4((java.lang.String) ((jz5.n) q0Var.f311432f).getValue())) {
            return kz5.b0.c(com.tencent.mm.plugin.profile.ui.mod.components.k1.class);
        }
        java.util.List list = kr3.q0.A;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            androidx.appcompat.app.AppCompatActivity activity = this.f311491e;
            kotlin.jvm.internal.o.g(activity, "activity");
            if (((kr3.j) pf5.z.f353948a.a(activity).a((java.lang.Class) obj)).i7()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
