package ya2;

/* loaded from: classes10.dex */
public final class t0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f460536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460537b;

    public t0(android.content.Intent intent, android.content.Context context) {
        this.f460536a = intent;
        this.f460537b = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        android.content.Intent intent = this.f460536a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            intent.putExtra("feed_object_id", finderObject != null ? finderObject.getId() : 0L);
        }
        wn2.f fVar2 = (wn2.f) i95.n0.c(wn2.f.class);
        android.content.Context context = this.f460537b;
        fVar2.Ai(context, intent);
        ya2.e1.f460472a.t(context, intent);
        return jz5.f0.f302826a;
    }
}
