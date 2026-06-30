package qy0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager f367572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager) {
        super(0);
        this.f367572d = mMMusicManager;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.model.MJLyricInfo[] lyricObjs = ((com.tencent.maas.model.MJMusicInfo) ((n0.q4) this.f367572d.f69745g).getValue()).getLyricObjs();
        if (lyricObjs == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(lyricObjs.length);
        for (com.tencent.maas.model.MJLyricInfo mJLyricInfo : lyricObjs) {
            if (mJLyricInfo == null) {
                mJLyricInfo = null;
            }
            java.lang.String content = mJLyricInfo != null ? mJLyricInfo.getContent() : null;
            if (content == null) {
                content = "";
            }
            arrayList.add(content);
        }
        return arrayList;
    }
}
