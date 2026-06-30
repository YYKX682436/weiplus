package mv2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.yj0 f331579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.BitmapFactory.Options f331580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mv2.l f331582g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f331583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f331584i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.r f331585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.storage.yj0 yj0Var, android.graphics.BitmapFactory.Options options, java.lang.String str, mv2.l lVar, com.tencent.mm.protobuf.g gVar, int i17, yz5.r rVar) {
        super(3);
        this.f331579d = yj0Var;
        this.f331580e = options;
        this.f331581f = str;
        this.f331582g = lVar;
        this.f331583h = gVar;
        this.f331584i = i17;
        this.f331585m = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.LinkedList list;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String action = (java.lang.String) obj2;
        dn.h hVar = (dn.h) obj3;
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f331579d;
        java.lang.String str = this.f331581f;
        mv2.l lVar = this.f331582g;
        android.graphics.BitmapFactory.Options options = this.f331580e;
        if (booleanValue) {
            yj0Var.field_state = 1;
            r45.e60 v07 = yj0Var.v0();
            r45.j60 j60Var = (v07 == null || (list = v07.getList(1)) == null) ? null : (r45.j60) kz5.n0.Z(list);
            if (j60Var != null) {
                j60Var.set(0, hVar != null ? hVar.field_fileUrl : null);
                j60Var.set(7, hVar != null ? hVar.field_thumbUrl : null);
                j60Var.set(5, java.lang.Integer.valueOf(hVar != null ? (int) hVar.field_fileLength : 0));
            }
            mv2.l lVar2 = mv2.l.f331597d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadImage success: outWidth ");
            sb6.append(options.outWidth);
            sb6.append(" outWidth ");
            sb6.append(options.outWidth);
            sb6.append(" width ");
            sb6.append(j60Var != null ? java.lang.Integer.valueOf(j60Var.getInteger(2)) : null);
            sb6.append(" height ");
            sb6.append(j60Var != null ? java.lang.Integer.valueOf(j60Var.getInteger(3)) : null);
            sb6.append(" thumb_url ");
            sb6.append(j60Var != null ? j60Var.getString(7) : null);
            sb6.append(" url ");
            sb6.append(j60Var != null ? j60Var.getString(0) : null);
            sb6.append(" imagePath ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", sb6.toString());
            mv2.i iVar = new mv2.i(yj0Var, this.f331583h, this.f331584i, this.f331585m);
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.field_localCommentId, yj0Var, false);
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().D0(yj0Var.field_feedId, yj0Var.t0(), yj0Var.field_localCommentId, com.tencent.mm.plugin.finder.storage.wj0.X, yj0Var);
            lVar.d(iVar);
        } else {
            mv2.l lVar3 = mv2.l.f331597d;
            com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", "uploadImage failed: outWidth " + options.outWidth + " outWidth " + options.outWidth + " imagePath " + str);
            lVar.c(yj0Var, action);
        }
        lVar.f331599b.remove(java.lang.Long.valueOf(yj0Var.field_localCommentId));
        return jz5.f0.f302826a;
    }
}
