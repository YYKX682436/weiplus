package vh;

/* loaded from: classes12.dex */
public class q extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f436815f;

    public q(android.view.View view) {
        super(view);
        this.f436815f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        vh.f fVar = (vh.f) hVar;
        this.f436818d = fVar;
        this.f436815f.setText(fVar.f436786d);
    }
}
