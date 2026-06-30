package gx1;

/* loaded from: classes12.dex */
public class t extends gx1.l {
    public t(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f277307i.setVisibility(0);
        this.f277304f.setVisibility(8);
        this.f277312q.setVisibility(8);
        this.f277307i.setTag(this);
        this.f277307i.setOnClickListener(this.f277318w);
    }

    @Override // gx1.a
    public int i() {
        return 0;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        this.f277310o.setImageResource(com.tencent.mm.R.raw.msg_state_fail_resend);
        android.support.v4.media.f.a(aVar);
        throw null;
    }
}
