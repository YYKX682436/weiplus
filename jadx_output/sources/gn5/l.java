package gn5;

/* loaded from: classes12.dex */
public abstract class l {
    public static com.tencent.mm.view.popview.AbstractPopView a(android.content.Context context, java.lang.Object obj) {
        if (!(obj instanceof gr.c0) && !(obj instanceof ir.a1)) {
            return ((obj instanceof ir.g) || (obj instanceof com.tencent.mm.storage.emotion.EmojiInfo)) ? new com.tencent.mm.view.popview.EmojiPopView(context, null) : new com.tencent.mm.view.popview.EmojiPopView(context, null);
        }
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.view.popview.SmileyPopView(context, null, 0, 6, null);
    }

    public static void b(com.tencent.mm.view.popview.AbstractPopView abstractPopView, java.lang.Object obj) {
        if (abstractPopView instanceof com.tencent.mm.view.popview.EmojiPopView) {
            if (obj instanceof com.tencent.mm.storage.emotion.EmojiInfo) {
                ((com.tencent.mm.view.popview.EmojiPopView) abstractPopView).setEmojiInfo((com.tencent.mm.storage.emotion.EmojiInfo) obj);
                return;
            } else {
                if (obj instanceof ir.g) {
                    ((com.tencent.mm.view.popview.EmojiPopView) abstractPopView).setEmojiInfo((com.tencent.mm.storage.emotion.EmojiInfo) ((ir.g) obj).f293836b);
                    return;
                }
                return;
            }
        }
        if (abstractPopView instanceof com.tencent.mm.view.popview.SmileyPopView) {
            if (obj instanceof gr.c0) {
                ((com.tencent.mm.view.popview.SmileyPopView) abstractPopView).setSmileyItem((gr.c0) obj);
            } else if (obj instanceof ir.a1) {
                ((com.tencent.mm.view.popview.SmileyPopView) abstractPopView).setSmileyItem(((ir.a1) obj).f293814b);
            }
        }
    }
}
