package gd2;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270529b;

    public f(java.lang.String str, gd2.i iVar) {
        this.f270528a = str;
        this.f270529b = iVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            g45.b.f268846a.a(this.f270528a, str, 0);
            tg3.a1 a17 = tg3.t1.a();
            gd2.i iVar = this.f270529b;
            ((dk5.s5) a17).Vi(iVar.f270532a, this.f270528a, iVar.f270533b, 0, "", "", null);
            com.tencent.mm.ui.MMActivity mMActivity = iVar.f270532a;
            com.tencent.mm.ui.widget.snackbar.j.c(mMActivity.getString(com.tencent.mm.R.string.fw6), null, mMActivity, null, null);
        }
    }
}
