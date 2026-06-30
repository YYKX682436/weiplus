package dk5;

/* loaded from: classes9.dex */
public class o3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.b9 f234773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234775c;

    public o3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, com.tencent.mm.storage.b9 b9Var, java.lang.String str) {
        this.f234775c = selectConversationUI;
        this.f234773a = b9Var;
        this.f234774b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        com.tencent.mm.storage.b9 b9Var = this.f234773a;
        intent.putExtra("kwebmap_slat", b9Var.f193776b);
        intent.putExtra("kwebmap_lng", b9Var.f193777c);
        intent.putExtra("Kwebmap_locaion", this.f234774b);
        intent.putExtra("kShowshare", false);
        j45.l.j(this.f234775c.getContext(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }
}
