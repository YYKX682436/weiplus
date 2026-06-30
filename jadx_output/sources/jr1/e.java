package jr1;

/* loaded from: classes2.dex */
public final class e implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f301356a;

    public e(yz5.l lVar) {
        this.f301356a = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        yz5.l lVar = this.f301356a;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.s16)) {
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
