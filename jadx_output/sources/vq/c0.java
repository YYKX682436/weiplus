package vq;

/* loaded from: classes9.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439140d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor all = com.tencent.mm.storage.n5.f().c().getAll();
        if (all != null) {
            while (all.moveToNext()) {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                emojiInfo.convertFrom(all);
                arrayList.add(emojiInfo);
            }
            all.close();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (n22.m.p((com.tencent.mm.storage.emotion.EmojiInfo) next)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = (com.tencent.mm.storage.emotion.EmojiInfo) next2;
                if ((n22.m.p(emojiInfo2) || n22.m.k(emojiInfo2)) ? false : true) {
                    arrayList3.add(next2);
                }
            }
            com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439140d;
            com.tencent.mars.xlog.Log.i(emojiDebugUI.d, "add emoji, " + arrayList.size());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add emoji, custom ");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next3 = it7.next();
                int i17 = ((com.tencent.mm.storage.emotion.EmojiInfo) next3).field_catalog;
                l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
                if (i17 == 81) {
                    arrayList4.add(next3);
                }
            }
            sb6.append(arrayList4.size());
            sb6.append(' ');
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = emojiDebugUI.d;
            com.tencent.mars.xlog.Log.i(str, sb7);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("add emoji, non store custom ");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next4 = it8.next();
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = (com.tencent.mm.storage.emotion.EmojiInfo) next4;
                if ((n22.m.p(emojiInfo3) || n22.m.k(emojiInfo3)) ? false : true) {
                    arrayList5.add(next4);
                }
            }
            sb8.append(arrayList5.size());
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                java.lang.Object next5 = it9.next();
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo4 = (com.tencent.mm.storage.emotion.EmojiInfo) next5;
                if ((n22.m.p(emojiInfo4) || n22.m.k(emojiInfo4) || !(com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo4.field_cdnUrl) ^ true)) ? false : true) {
                    arrayList6.add(next5);
                }
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it10 = arrayList6.iterator();
            while (it10.hasNext()) {
                arrayList7.add(((com.tencent.mm.storage.emotion.EmojiInfo) it10.next()).getMd5());
            }
            java.util.Collections.shuffle(arrayList7);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            pm0.v.L("EmojiDebugUI_addEmoji", true, new vq.n(arrayList7, emojiDebugUI, new kotlin.jvm.internal.c0(), c0Var, new java.lang.Object(), new kotlin.jvm.internal.f0(), com.tencent.mm.ui.widget.dialog.u3.f(emojiDebugUI, emojiDebugUI.getString(com.tencent.mm.R.string.c0d), true, 0, new vq.q(c0Var))));
        }
        return jz5.f0.f302826a;
    }
}
