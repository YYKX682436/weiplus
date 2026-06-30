package ir;

/* loaded from: classes15.dex */
public final class c extends ir.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f293819d;

    public c(boolean z17) {
        super(ir.v0.a());
        java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> b17 = gr.t.g().b(true);
        this.f293819d = b17.size();
        if (b17.isEmpty()) {
            if (z17) {
                this.f293813c.add(new ir.b());
                return;
            }
            return;
        }
        this.f293813c.add(this.f293812b);
        if (z17) {
            this.f293813c.add(new ir.z(1));
        }
        pr.z zVar = pr.k0.f357723q;
        int a17 = zVar.a(false).a();
        int g17 = zVar.a(false).g();
        int i17 = 0;
        for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : b17) {
            if (i17 >= g17) {
                break;
            }
            if (i17 >= a17) {
                java.util.LinkedList linkedList = this.f293813c;
                kotlin.jvm.internal.o.d(emojiInfo);
                linkedList.add(new ir.g(emojiInfo, 3, null, 0, 12, null));
            } else {
                java.util.LinkedList linkedList2 = this.f293813c;
                kotlin.jvm.internal.o.d(emojiInfo);
                linkedList2.add(new ir.g(emojiInfo, 1, null, 0, 12, null));
            }
            i17++;
        }
        if (pr.k0.f357723q.a(false).c()) {
            this.f293813c.add(new ir.e0(1));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f293819d;
    }
}
