package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class iw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(com.tencent.mm.plugin.finder.live.widget.nw nwVar, java.util.List list) {
        super(0);
        this.f118702d = nwVar;
        this.f118703e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List V0 = kz5.n0.V0(this.f118703e);
        com.tencent.mm.plugin.finder.live.widget.nw nwVar = this.f118702d;
        android.content.Context context = nwVar.f118381d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            kotlinx.coroutines.l.d(v65.m.b(appCompatActivity), null, null, new com.tencent.mm.plugin.finder.live.widget.ew(appCompatActivity, V0, nwVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
