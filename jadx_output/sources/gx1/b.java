package gx1;

/* loaded from: classes12.dex */
public class b extends gx1.l {
    public b(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f277307i.setVisibility(0);
        this.f277304f.setVisibility(8);
        this.f277312q.setVisibility(8);
        this.f277307i.setTag(this);
        this.f277307i.setOnClickListener(this.f277318w);
    }

    @Override // gx1.a
    public int i() {
        return 5;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        ix1.b bVar = (ix1.b) aVar;
        java.lang.String str = bVar.f295341u;
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        this.f277310o.setImageResource(o25.y.a(str));
        this.f277308m.setText(bVar.f295339s);
        this.f277309n.setText(bVar.f295340t);
        super.j(aVar, i17, i18);
    }
}
