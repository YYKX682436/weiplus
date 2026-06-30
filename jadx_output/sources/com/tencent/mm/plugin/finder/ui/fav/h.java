package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.ui.fav.p pVar) {
        super(0);
        this.f129172d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        android.app.Activity context = this.f129172d.f().f129217a;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            return nyVar.V6();
        }
        return null;
    }
}
