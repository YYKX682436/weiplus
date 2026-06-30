package vh;

/* loaded from: classes12.dex */
public class r extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f436816f;

    public r(android.view.View view) {
        super(view);
        this.f436816f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        vh.g gVar = (vh.g) hVar;
        this.f436818d = gVar;
        if (android.text.TextUtils.isEmpty(gVar.f436787d)) {
            return;
        }
        this.f436816f.setText(gVar.f436787d);
    }
}
