package i12;

/* loaded from: classes15.dex */
public class o extends i12.m {

    /* renamed from: p, reason: collision with root package name */
    public int f287228p;

    /* renamed from: q, reason: collision with root package name */
    public int f287229q;

    /* renamed from: r, reason: collision with root package name */
    public int f287230r;

    public o(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.f287228p = 0;
        this.f287229q = 0;
        this.f287230r = 0;
    }

    @Override // i12.m, j12.b
    public int c() {
        return this.f287230r;
    }

    @Override // i12.m, j12.b
    public int f() {
        return this.f287228p;
    }

    @Override // j12.b, android.widget.Adapter
    public int getCount() {
        return super.getCount();
    }

    @Override // j12.b, android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return super.getItem(i17);
    }

    @Override // j12.b
    /* renamed from: h */
    public j12.i getItem(int i17) {
        return super.getItem(i17);
    }

    @Override // i12.m, j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.l lVar = (i12.l) view.getTag();
        int i18 = this.f287228p;
        android.content.Context context = this.f297151d;
        if (i18 <= 0) {
            int i19 = this.f287229q;
            if (i19 > 0) {
                if (i17 == 0) {
                    lVar.f287189u.setVisibility(0);
                    lVar.f287189u.setText(context.getString(com.tencent.mm.R.string.bz6));
                } else if (i17 == i18 + i19) {
                    lVar.f287189u.setVisibility(0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.emoji.model.o.a().f97590f)) {
                        lVar.f287189u.setText(com.tencent.mm.plugin.emoji.model.o.a().f97590f);
                    } else if (com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
                        lVar.f287189u.setText(com.tencent.mm.R.string.f491114bz5);
                    } else {
                        lVar.f287189u.setText(context.getString(com.tencent.mm.R.string.bye));
                    }
                } else {
                    lVar.f287189u.setVisibility(8);
                }
            } else if (i17 == 0) {
                lVar.f287189u.setVisibility(0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.emoji.model.o.a().f97590f)) {
                    lVar.f287189u.setText(com.tencent.mm.plugin.emoji.model.o.a().f97590f);
                } else if (com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
                    lVar.f287189u.setText(com.tencent.mm.R.string.f491114bz5);
                } else {
                    lVar.f287189u.setText(context.getString(com.tencent.mm.R.string.bye));
                }
            } else {
                lVar.f287189u.setVisibility(8);
            }
        } else if (i17 == 0) {
            lVar.f287189u.setVisibility(0);
            lVar.f287189u.setText(context.getString(com.tencent.mm.R.string.byt));
        } else {
            int i27 = this.f287229q;
            if (i27 > 0 && i17 == i18) {
                lVar.f287189u.setVisibility(0);
                lVar.f287189u.setText(context.getString(com.tencent.mm.R.string.bz6));
            } else if (i17 == i18 + i27) {
                lVar.f287189u.setVisibility(0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.emoji.model.o.a().f97590f)) {
                    lVar.f287189u.setText(com.tencent.mm.plugin.emoji.model.o.a().f97590f);
                } else if (com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
                    lVar.f287189u.setText(com.tencent.mm.R.string.f491114bz5);
                } else {
                    lVar.f287189u.setText(context.getString(com.tencent.mm.R.string.bye));
                }
            } else {
                lVar.f287189u.setVisibility(8);
            }
        }
        android.widget.FrameLayout frameLayout = lVar.f287190v;
        if (frameLayout != null) {
            frameLayout.postDelayed(new i12.n(this, lVar), 100L);
        }
        super.j(i17, view, viewGroup);
        return view;
    }

    @Override // i12.m, j12.b
    public int k() {
        return this.f287229q;
    }

    @Override // i12.m, j12.b
    public void o(int i17) {
        this.f287230r = i17;
    }

    @Override // i12.m, j12.b
    public void p(int i17) {
        this.f287228p = i17;
    }

    @Override // i12.m, j12.b
    public void q(int i17) {
        this.f287229q = i17;
    }
}
