package yt3;

/* loaded from: classes10.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f465541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.on0 f465543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(yt3.r4 r4Var, lt3.f0 f0Var, java.lang.String str, r45.on0 on0Var) {
        super(0);
        this.f465540d = r4Var;
        this.f465541e = f0Var;
        this.f465542f = str;
        this.f465543g = on0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yt3.r4 r4Var = this.f465540d;
        yt3.r4.b(r4Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_thumb_path", this.f465541e.f321212a.f331289a.f412534e);
        intent.putExtra("key_bg_mix_task_id", this.f465542f);
        intent.putExtra("key_video_duration", this.f465543g.f382364d);
        intent.putExtra("key_extra_data", ut3.f.f431176c.f431178b);
        android.content.Context context = r4Var.f465646d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).setResult(888, intent);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
        return jz5.f0.f302826a;
    }
}
