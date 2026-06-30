package gb0;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f269962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f269964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f269965g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269966h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, java.lang.String str, long j17, java.lang.Long l17, java.lang.String str2) {
        super(0);
        this.f269962d = context;
        this.f269963e = str;
        this.f269964f = j17;
        this.f269965g = l17;
        this.f269966h = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bh5.c cVar = new bh5.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_open_type", 3L);
        intent.putExtra("key_session_id", this.f269963e);
        intent.putExtra("key_scene_type", this.f269964f);
        intent.putExtra("key_msg_id", this.f269965g);
        intent.putExtra("key_talker", this.f269966h);
        intent.putExtra("key_material_origin", "chat");
        pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.n.class);
        pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.p0.class);
        pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.d.class);
        cVar.d(intent);
        cVar.f20922a.f20924a = this.f269962d;
        cVar.a(com.tencent.mm.feature.openmsg.ui.OpenMsgUI.class.getName());
        cVar.b(com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog.class);
        cVar.g();
        return jz5.f0.f302826a;
    }
}
