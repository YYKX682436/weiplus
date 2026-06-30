package hl5;

/* loaded from: classes15.dex */
public class b implements gl5.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl5.g f282119d;

    public b(hl5.g gVar) {
        this.f282119d = gVar;
    }

    @Override // gl5.d0
    public void a(int i17, int i18, boolean z17, boolean z18) {
        hl5.g gVar = this.f282119d;
        gVar.f282126a.dismiss();
        java.lang.Runnable runnable = gVar.f282141p;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = gVar.f282134i;
        customTextView.removeCallbacks(runnable);
        customTextView.postDelayed(runnable, 100L);
    }
}
