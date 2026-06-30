package gb0;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f269955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f269956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f269958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269960i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(0);
        this.f269955d = context;
        this.f269956e = j17;
        this.f269957f = str;
        this.f269958g = j18;
        this.f269959h = str2;
        this.f269960i = str3;
        this.f269961m = str4;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bh5.c cVar = new bh5.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_open_type", this.f269956e);
        intent.putExtra("key_session_id", this.f269957f);
        intent.putExtra("key_scene_type", this.f269958g);
        intent.putExtra("key_is_multi_select", false);
        intent.putExtra("key_material_model", new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel(this.f269959h, this.f269960i, this.f269961m));
        intent.putExtra("key_material_origin", "");
        pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.h.class);
        pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.o0.class);
        cVar.d(intent);
        cVar.f20922a.f20924a = this.f269955d;
        cVar.a(com.tencent.mm.feature.openmsg.ui.OpenMsgUI.class.getName());
        cVar.b(com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog.class);
        cVar.g();
        return jz5.f0.f302826a;
    }
}
