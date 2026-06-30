package na2;

/* loaded from: classes2.dex */
public final class i implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ na2.k f335963a;

    public i(na2.k kVar) {
        this.f335963a = kVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        na2.k kVar = this.f335963a;
        lVarArr[0] = new jz5.l("shoot_status", java.lang.Integer.valueOf(kVar.f335970n));
        android.widget.TextView textView = kVar.f335966g;
        lVarArr[1] = new jz5.l("cluster_name", textView != null ? textView.getText() : null);
        android.widget.TextView textView2 = kVar.f335967h;
        lVarArr[2] = new jz5.l("cluster_reason_recommendation", textView2 != null ? textView2.getText() : null);
        return kz5.c1.k(lVarArr);
    }
}
