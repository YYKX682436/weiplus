package df2;

/* loaded from: classes10.dex */
public final class ts implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231470a;

    public ts(df2.lt ltVar) {
        this.f231470a = ltVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        in5.c cVar = this.f231470a.f230710r;
        java.lang.Integer num = null;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (finderJumpInfo = hVar.f233541d) != null) {
            num = java.lang.Integer.valueOf(finderJumpInfo.getJumpinfo_type());
        }
        return kz5.b1.e(new jz5.l("banner_jump_type", num));
    }
}
