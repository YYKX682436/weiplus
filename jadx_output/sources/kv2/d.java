package kv2;

/* loaded from: classes.dex */
public final class d implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final kv2.d f312658d = new kv2.d();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingFinderMentionRouter", "onTingFinderMentionLike error!, errType = " + i17 + ", errCode = " + i18);
        return 0;
    }
}
