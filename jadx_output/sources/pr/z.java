package pr;

/* loaded from: classes15.dex */
public final class z {
    public z(kotlin.jvm.internal.i iVar) {
    }

    public final pr.b1 a(boolean z17) {
        pr.b1 b1Var = (pr.b1) ((jz5.n) pr.k0.f357727u).getValue();
        if (!z17) {
            b1Var.init();
        }
        return b1Var;
    }

    public final pr.b1 b(boolean z17) {
        pr.b1 b1Var = (pr.b1) ((jz5.n) pr.k0.f357726t).getValue();
        if (!z17) {
            b1Var.init();
        }
        return b1Var;
    }

    public final com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData c(int i17) {
        pr.k0 k0Var;
        com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData emojiSyncLoaderIPC$EmojiSyncData = new com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData();
        emojiSyncLoaderIPC$EmojiSyncData.f64925d = i17;
        if (i17 == 1) {
            pr.b1 a17 = a(false);
            kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.emoji.sync.EmojiSyncLoader");
            k0Var = (pr.k0) a17;
        } else {
            pr.b1 b17 = b(false);
            kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type com.tencent.mm.emoji.sync.EmojiSyncLoader");
            k0Var = (pr.k0) b17;
        }
        emojiSyncLoaderIPC$EmojiSyncData.f64926e = k0Var.f357731d;
        emojiSyncLoaderIPC$EmojiSyncData.f64928g = k0Var.f357733f;
        emojiSyncLoaderIPC$EmojiSyncData.f64927f = k0Var.f357732e;
        emojiSyncLoaderIPC$EmojiSyncData.f64929h = k0Var.f357736i;
        return emojiSyncLoaderIPC$EmojiSyncData;
    }
}
