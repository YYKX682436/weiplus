package x82;

/* loaded from: classes9.dex */
public class r implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f452527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452528b;

    public r(o72.r2 r2Var, android.content.Context context) {
        this.f452527a = r2Var;
        this.f452528b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_content", this.f452527a.field_favProto.f370974s);
        android.content.Context context = this.f452528b;
        j45.l.u(context, ".ui.transmit.RetransmitPreviewUI", intent, null);
        db5.f.j(context);
    }
}
