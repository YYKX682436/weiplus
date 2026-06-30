package hf3;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf3.c f281218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hf3.c cVar) {
        super(1);
        this.f281218d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.CharSequence text = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.j9v)).getText();
        java.lang.CharSequence text2 = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.j9p)).getText();
        if (((android.widget.ImageView) it.findViewById(com.tencent.mm.R.id.k9w)).getVisibility() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) text);
            sb6.append(',');
            sb6.append((java.lang.Object) text2);
            sb6.append('}');
            return sb6.toString();
        }
        return ((java.lang.Object) text) + ',' + ((java.lang.Object) text2) + ',' + this.f281218d.getString(com.tencent.mm.R.string.kr6);
    }
}
