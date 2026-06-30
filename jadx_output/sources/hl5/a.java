package hl5;

/* loaded from: classes15.dex */
public class a implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hl5.g f282118a;

    public a(hl5.g gVar) {
        this.f282118a = gVar;
    }

    @Override // nl5.a0
    public void a(android.view.View view, nl5.z zVar, java.lang.String str) {
        hl5.g gVar = this.f282118a;
        gVar.getClass();
        int i17 = zVar.f338398b;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = gVar.f282134i;
        switch (i17) {
            case android.R.id.selectAll:
                customTextView.h0();
                break;
            case android.R.id.cut:
                customTextView.c0(android.R.id.cut);
                break;
            case android.R.id.copy:
                customTextView.c0(android.R.id.copy);
                break;
            case android.R.id.paste:
                customTextView.c0(android.R.id.paste);
                break;
        }
        java.util.Map map = gVar.f282138m;
        int i18 = zVar.f338398b;
        if (((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i18)) && customTextView.getAdaptText() != null) {
            try {
                customTextView.getAdaptText().onTextContextMenuItem(i18);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("cmEdit.OperateWindow", th6, "adaptText item err %s %s", zVar.f338397a, java.lang.Integer.valueOf(i18));
                fl5.b.a(11);
            }
            customTextView.t0();
        }
        if (customTextView.getMenuCallback() != null) {
            customTextView.getMenuCallback().a(view, zVar, str);
        }
    }

    @Override // nl5.a0
    public void b(java.util.List list, int i17) {
    }
}
