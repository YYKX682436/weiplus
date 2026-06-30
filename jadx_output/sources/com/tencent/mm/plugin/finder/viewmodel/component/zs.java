package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class zs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f136716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f136717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        super(0);
        this.f136716d = appCompatActivity;
        this.f136717e = ptVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final yz5.p pVar = this.f136717e.L;
        z41.c cVar = new z41.c(this.f136716d, new z41.b(pVar) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.nt

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.p f135351a;

            {
                kotlin.jvm.internal.o.g(pVar, "function");
                this.f135351a = pVar;
            }

            @Override // z41.b
            public final /* synthetic */ void a(z41.a aVar, z41.a aVar2) {
                this.f135351a.invoke(aVar, aVar2);
            }
        });
        cVar.enable();
        return cVar;
    }
}
