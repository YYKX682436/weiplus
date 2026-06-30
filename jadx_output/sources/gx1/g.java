package gx1;

/* loaded from: classes12.dex */
public class g extends gx1.l {
    public g(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        gx1.f fVar = new gx1.f(this);
        this.f277307i.setVisibility(0);
        this.f277304f.setVisibility(8);
        this.f277312q.setVisibility(8);
        this.f277307i.setTag(this);
        this.f277307i.setOnClickListener(fVar);
    }

    @Override // gx1.a
    public int i() {
        return 3;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        this.f277310o.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_location);
        ix1.e eVar = (ix1.e) aVar;
        this.f277308m.setText(eVar.f295330s);
        this.f277309n.setText(eVar.f295334w);
        super.j(aVar, i17, i18);
    }
}
