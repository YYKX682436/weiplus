package ir;

/* loaded from: classes15.dex */
public final class e extends ir.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f293830d;

    public e(boolean z17, boolean z18) {
        super(ir.v0.b());
        java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> a17 = gr.t.g().a();
        this.f293830d = a17.size();
        this.f293813c.add(this.f293812b);
        if (z17) {
            this.f293813c.add(new ir.z(0));
        }
        pr.z zVar = pr.k0.f357723q;
        int a18 = zVar.b(false).a();
        int g17 = zVar.b(false).g();
        int i17 = 0;
        for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : a17) {
            if (z18 || !n22.m.l(emojiInfo)) {
                if (i17 >= g17) {
                    break;
                }
                if (i17 >= a18) {
                    java.util.LinkedList linkedList = this.f293813c;
                    kotlin.jvm.internal.o.d(emojiInfo);
                    linkedList.add(new ir.g(emojiInfo, 3, null, 0, 12, null));
                } else {
                    java.util.LinkedList linkedList2 = this.f293813c;
                    kotlin.jvm.internal.o.d(emojiInfo);
                    linkedList2.add(new ir.g(emojiInfo, 0, null, 0, 12, null));
                }
                i17++;
            }
        }
        if (pr.k0.f357723q.b(false).c()) {
            this.f293813c.add(new ir.e0(0));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f293830d;
    }
}
