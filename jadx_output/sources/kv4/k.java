package kv4;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.l f312706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kv4.l lVar) {
        super(1);
        this.f312706d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        mv4.b bVar = (mv4.b) kz5.n0.Z(((rv4.a) this.f312706d.f312708a).f400424a);
        if (bVar != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482795sc1);
            if (textView != null) {
                textView.setText(((rv4.b) bVar).f400435d);
            }
            view.setOnClickListener(new kv4.j(bVar));
        }
        return jz5.f0.f302826a;
    }
}
