package gx1;

/* loaded from: classes12.dex */
public class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.x f277331d;

    public w(gx1.x xVar) {
        this.f277331d = xVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.component.editor.f fVar = com.tencent.mm.plugin.component.editor.f.f96553d;
        gx1.x xVar = this.f277331d;
        fVar.e(xVar.f277332d.f277303e.f295311a);
        ((java.util.ArrayList) fVar.f96554a).remove(xVar.f277332d.B);
    }
}
