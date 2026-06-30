package dk5;

/* loaded from: classes.dex */
public final class x implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n13.t f234982a;

    public x(n13.t tVar) {
        this.f234982a = tVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        if (intent == null || (str = intent.getStringExtra("Retr_ForwardExtraText")) == null) {
            str = "";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_group_to_do", intent != null ? intent.getBooleanExtra("KSendGroupToDo", false) : false);
        n13.t tVar = this.f234982a;
        com.tencent.mm.ui.widget.dialog.j jVar = tVar.f334133a;
        if (jVar != null) {
            jVar.a(i17 == -1, str, 0);
        }
        n13.x xVar = tVar.f334134b;
        if (xVar != null) {
            xVar.a(i17 == -1, str, bundle);
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = tVar.f334136d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
