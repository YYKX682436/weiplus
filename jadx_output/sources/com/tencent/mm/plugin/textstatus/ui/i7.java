package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class i7 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f173975d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f173976e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f173977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f173978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173979h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(kotlin.coroutines.Continuation continuation, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(3, continuation);
        this.f173978g = mMEditText;
        this.f173979h = textStatusDoWhatActivityV2;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.textstatus.ui.i7 i7Var = new com.tencent.mm.plugin.textstatus.ui.i7((kotlin.coroutines.Continuation) obj3, this.f173978g, this.f173979h);
        i7Var.f173976e = (kotlinx.coroutines.flow.k) obj;
        i7Var.f173977f = obj2;
        return i7Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f173975d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f173976e;
            android.text.Editable editable = (android.text.Editable) this.f173977f;
            android.content.Context context = this.f173978g.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            vj4.d dVar = (vj4.d) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(vj4.d.class);
            com.tencent.mm.plugin.appbrand.service.l5 l5Var = this.f173979h.f173556x;
            java.lang.String wording = editable.toString();
            dVar.getClass();
            kotlin.jvm.internal.o.g(wording, "wording");
            kotlinx.coroutines.flow.m2 m2Var = new kotlinx.coroutines.flow.m2(new vj4.c(dVar, wording, l5Var, null));
            this.f173975d = 1;
            if (kVar instanceof kotlinx.coroutines.flow.k3) {
                throw ((kotlinx.coroutines.flow.k3) kVar).f310311d;
            }
            java.lang.Object a17 = m2Var.a(kVar, this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
