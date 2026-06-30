package dr;

/* loaded from: classes12.dex */
public abstract class s {

    /* renamed from: a */
    public final com.tencent.mm.api.IEmojiInfo f242400a;

    /* renamed from: b */
    public er.f f242401b;

    public s(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f242400a = emojiInfo;
    }

    public static /* synthetic */ void e(dr.s sVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reload");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        sVar.d(z17);
    }

    public static /* synthetic */ void g(dr.s sVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        sVar.f(z17);
    }

    public void a() {
        er.f fVar = this.f242401b;
        if (fVar != null) {
            fVar.g(this);
        }
    }

    public er.f b() {
        ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).getClass();
        com.tencent.mm.api.IEmojiInfo emojiInfo = this.f242400a;
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        zq.h hVar = zq.h.f474972a;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = (com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo;
        er.f fVar = (er.f) zq.h.f474973b.get(emojiInfo2.getMd5());
        return fVar == null ? ((km0.c) gm0.j1.p().a()).a() ? new er.d(emojiInfo2) : new er.j(emojiInfo2) : fVar;
    }

    public abstract void c(boolean z17);

    public void d(boolean z17) {
        er.f fVar = this.f242401b;
        if (fVar != null) {
            fVar.g(this);
        }
        er.f b17 = b();
        this.f242401b = b17;
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "addRequest , " + b17.f255930f.getMd5() + ", " + b17.f255935n);
            if (b17.f255935n) {
                c(b17.f255934m);
            } else {
                java.util.List list = b17.f255937p;
                if (!list.contains(this)) {
                    list.add(this);
                }
            }
        }
        er.f fVar2 = this.f242401b;
        if (fVar2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "start , " + fVar2.f255930f.getMd5() + ", " + fVar2.f255931g);
            if (fVar2.f255931g) {
                return;
            }
            fVar2.f255931g = true;
            com.tencent.mm.feature.emoji.api.w5 w5Var = (com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class);
            java.lang.String key = fVar2.e();
            ((com.tencent.mm.feature.emoji.m0) w5Var).getClass();
            kotlin.jvm.internal.o.g(key, "key");
            zq.h hVar = zq.h.f474972a;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader", "addTask: " + key + ' ' + z17);
            zq.h.f474973b.put(key, fVar2);
            if (fVar2.f255936o == er.k.f255941e) {
                fVar2.run();
            } else if (z17) {
                zq.h.f474974c.a(fVar2);
            } else {
                fVar2.run();
            }
        }
    }

    public abstract void f(boolean z17);
}
