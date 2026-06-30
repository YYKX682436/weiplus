package mz0;

/* loaded from: classes5.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333041d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c f333045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String str, mz0.b2 b2Var, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333043f = str;
        this.f333044g = b2Var;
        this.f333045h = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mz0.s1 s1Var = new mz0.s1(this.f333043f, this.f333044g, this.f333045h, continuation);
        s1Var.f333042e = obj;
        return s1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.r2 r2Var;
        kotlinx.coroutines.y0 y0Var2;
        kotlinx.coroutines.r2 r2Var2;
        kotlinx.coroutines.y0 y0Var3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333041d;
        boolean z17 = false;
        mz0.b2 b2Var = this.f333044g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f333042e;
            kotlinx.coroutines.r2 r2Var3 = b2Var.B;
            if (r2Var3 != null) {
                ((kotlinx.coroutines.a) r2Var3).a();
            }
            kotlinx.coroutines.r2 r2Var4 = b2Var.C;
            if (r2Var4 != null) {
                r2Var4.a();
            }
            kotlinx.coroutines.r2 r2Var5 = b2Var.C;
            if ((r2Var5 != null && r2Var5.a()) && (r2Var = b2Var.C) != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            android.app.Activity context = b2Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            az0.n7 n7Var = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69783d;
            kotlinx.coroutines.r2 r2Var6 = n7Var != null ? n7Var.f15747f : null;
            if (r2Var6 != null && r2Var6.a()) {
                this.f333042e = y0Var;
                this.f333041d = 1;
                if (r2Var6.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y0Var3 = (kotlinx.coroutines.y0) this.f333042e;
                kotlin.ResultKt.throwOnFailure(obj);
                y0Var2 = y0Var3;
                b2Var.C = kotlinx.coroutines.l.d(y0Var2, null, null, new mz0.r1(this.f333045h, this.f333043f, b2Var, null), 3, null);
                return jz5.f0.f302826a;
            }
            kotlinx.coroutines.y0 y0Var4 = (kotlinx.coroutines.y0) this.f333042e;
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = y0Var4;
        }
        kotlinx.coroutines.r2 r2Var7 = b2Var.B;
        if (r2Var7 != null && ((kotlinx.coroutines.a) r2Var7).a()) {
            z17 = true;
        }
        if (!z17 || (r2Var2 = b2Var.B) == null) {
            y0Var2 = y0Var;
            b2Var.C = kotlinx.coroutines.l.d(y0Var2, null, null, new mz0.r1(this.f333045h, this.f333043f, b2Var, null), 3, null);
            return jz5.f0.f302826a;
        }
        this.f333042e = y0Var;
        this.f333041d = 2;
        if (((kotlinx.coroutines.c3) r2Var2).C(this) == aVar) {
            return aVar;
        }
        y0Var3 = y0Var;
        y0Var2 = y0Var3;
        b2Var.C = kotlinx.coroutines.l.d(y0Var2, null, null, new mz0.r1(this.f333045h, this.f333043f, b2Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
