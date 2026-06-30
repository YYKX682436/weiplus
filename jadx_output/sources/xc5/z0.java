package xc5;

/* loaded from: classes12.dex */
public final class z0 extends xc5.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f453603c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f453604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.storage.f9 msgInfo) {
        super(msgInfo, null);
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f453603c = new java.util.LinkedHashMap();
        this.f453604d = new java.util.LinkedHashMap();
    }

    @Override // mf3.k
    public gg3.c a() {
        mf3.w level = getLevel();
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) this.f453603c).get(level);
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = (java.lang.String) ((java.util.LinkedHashMap) this.f453604d).get(level);
        java.lang.String str4 = str3 == null ? "" : str3;
        if (r26.n0.N(str2) || r26.n0.N(str4)) {
            return null;
        }
        return new gg3.c(getId(), str2, str4, null, 0L, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // xc5.b
    public co.a d() {
        java.lang.Object obj;
        java.util.Map map = this.f453603c;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(getLevel());
        if (str == null) {
            str = "";
        }
        if (r26.n0.N(str)) {
            java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!r26.n0.N((java.lang.String) obj)) {
                    break;
                }
            }
            java.lang.String str2 = (java.lang.String) obj;
            str = str2 != null ? str2 : "";
        }
        if (r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiveMsgHistoryGalleryMediaInfo", "createForwardViewModel: no cached thumb, msgId=" + this.f453399a.getMsgId());
            return null;
        }
        jd5.a aVar = new jd5.a();
        h(aVar);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar.p(str);
        return aVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        return null;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return "";
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326125g;
    }

    public final void i(mf3.w level, java.lang.String thumbPath, java.lang.String videoPath) {
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        if (r26.n0.N(thumbPath) || r26.n0.N(videoPath)) {
            return;
        }
        this.f453603c.put(level, thumbPath);
        this.f453604d.put(level, videoPath);
    }
}
