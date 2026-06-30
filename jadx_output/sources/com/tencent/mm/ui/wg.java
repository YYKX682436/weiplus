package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public final class wg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(android.content.Context context) {
        super(0);
        this.f211235d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f211235d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.ref.WeakReference weakReference = ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).f428419f;
        if (weakReference != null) {
            return (com.tencent.mm.ui.widget.listview.PullDownListView) weakReference.get();
        }
        return null;
    }
}
