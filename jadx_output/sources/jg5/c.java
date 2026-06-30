package jg5;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final jg5.c f299665a = new jg5.c();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f299666b;

    static {
        boolean z17 = false;
        if (pg5.d.f354252a != null) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_global_emoji_v2, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SmileyExtension", "enableTextViewEmojiProcess %s", java.lang.Boolean.valueOf(fj6));
            if (!com.tencent.mm.sdk.platformtools.x2.j()) {
                z17 = fj6;
            }
        }
        f299666b = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.view.View view, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(view, "view");
        if (f299666b) {
            jg5.a aVar = jg5.a.f299662a;
            view.hashCode();
            if (view instanceof android.widget.EditText) {
                z17 = aVar.a(((android.widget.EditText) view).getInputType());
            } else if (view instanceof fl5.i) {
                z17 = aVar.a(((fl5.i) view).getInputType());
            } else if (view instanceof android.widget.TextView) {
                z17 = aVar.a(((android.widget.TextView) view).getInputType());
            } else {
                if (!(view instanceof com.tencent.mm.ui.widget.MMNeat7extView)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiProcessPreChecker", "hadInvalidInputType: unknown view type");
                }
                z17 = false;
            }
            if (z17) {
                return;
            }
            b(view, i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view instanceof android.widget.EditText) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiProcessTextProvider", "processViewWithoutCheck: EditText type view class name:" + view.getClass().getCanonicalName() + " hash:" + view.hashCode());
            android.widget.EditText editText = (android.widget.EditText) view;
            if (lg5.a.f318580b == null) {
                synchronized (lg5.a.f318579a) {
                    if (lg5.a.f318580b == null) {
                        lg5.a.f318580b = new lg5.a();
                    }
                }
            }
            editText.setEditableFactory(lg5.a.f318580b);
            editText.addTextChangedListener(new lg5.b(view, i17));
            return;
        }
        if (view instanceof fl5.i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiProcessTextProvider", "processViewWithoutCheck: IEditText type view class:" + view.getClass().getCanonicalName() + " hash:" + view.hashCode());
            fl5.i iVar = (fl5.i) view;
            iVar.addTextChangedListener(new lg5.b(iVar.j(), i17));
            return;
        }
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            textView.setFilters(new android.text.InputFilter[]{new kg5.a(textView, i17)});
        } else {
            if (!(view instanceof com.tencent.mm.ui.widget.MMNeat7extView)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiProcessTextProvider", "processView: unknown view type");
                return;
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view;
            android.widget.TextView wrappedTextView = mMNeat7extView.getWrappedTextView();
            android.widget.TextView wrappedTextView2 = mMNeat7extView.getWrappedTextView();
            kotlin.jvm.internal.o.f(wrappedTextView2, "getWrappedTextView(...)");
            wrappedTextView.setFilters(new android.text.InputFilter[]{new kg5.a(wrappedTextView2, i17)});
        }
    }
}
