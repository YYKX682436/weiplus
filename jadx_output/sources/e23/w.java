package e23;

/* loaded from: classes12.dex */
public class w extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.x f246974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e23.x xVar, e23.u uVar) {
        super(xVar);
        this.f246974b = xVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        com.tencent.mm.plugin.fts.ui.n3.a(this.f246974b.f246984q, ((e23.v) eVar).f246970a);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489115bc0, viewGroup, false);
        e23.v vVar = this.f246974b.f246986s;
        vVar.f246970a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        inflate.setTag(vVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("query_phrase_list", com.tencent.mm.sdk.platformtools.t8.P1(this.f246974b.f423762e.f351131c));
        intent.putExtra("go_to_chatroom_direct", true);
        intent.putExtra("scene_from", 3);
        j45.l.u(context, ".ui.transmit.MMCreateChatroomUI", intent, null);
        return true;
    }
}
