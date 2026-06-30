package r35;

/* loaded from: classes9.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f369134a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.i0 f369135b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f369136c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369137d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f369138e;

    public i1(android.content.Context context) {
        this.f369134a = context;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        this.f369135b = i0Var;
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = false;
        aVar.B = false;
        aVar.f211725o = new r35.h1(this);
    }

    public r35.i1 a(com.tencent.mm.ui.widget.dialog.j jVar) {
        com.tencent.mm.ui.widget.dialog.j0 a17 = this.f369135b.a();
        this.f369136c = a17;
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f369138e;
        if (onDismissListener != null) {
            a17.setOnDismissListener(onDismissListener);
        }
        r35.j1.d(this.f369134a, this.f369136c, this.f369137d, null, jVar, jVar);
        return this;
    }

    public r35.i1 b(com.tencent.mm.ui.widget.dialog.i iVar) {
        this.f369135b.f211821b.f211724n = iVar;
        return this;
    }

    public r35.i1 c(android.view.View view) {
        this.f369135b.f211821b.L = view;
        return this;
    }

    public r35.i1 d(android.graphics.Bitmap bitmap, int i17) {
        com.tencent.mm.ui.widget.dialog.a aVar = this.f369135b.f211821b;
        aVar.f211727q = bitmap;
        aVar.D = true;
        aVar.T = i17;
        aVar.C = false;
        aVar.H = new r35.x0(bitmap);
        return this;
    }

    public r35.i1 e(java.lang.String str) {
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f369134a).inflate(com.tencent.mm.R.layout.bxv, (android.view.ViewGroup) null);
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = (com.tencent.mm.emoji.view.AbsEmojiView) inflate.findViewById(com.tencent.mm.R.id.czc);
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f369135b;
        if (absEmojiView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
        } else {
            com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str);
            if (str.indexOf(47) == -1) {
                s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
                h12.b0.a();
                ((y12.h) wi6).getClass();
                str = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", str);
            }
            if (N != null) {
                absEmojiView.setEmojiInfo(N);
            } else {
                absEmojiView.setImageFilePath(str);
            }
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.L = inflate;
            aVar.R = 1;
        }
        i0Var.f211821b.C = false;
        return this;
    }

    public r35.i1 f(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, java.lang.String str) {
        android.content.Context context = this.f369134a;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bxv, (android.view.ViewGroup) null);
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = (com.tencent.mm.emoji.view.EmojiStatusView) inflate.findViewById(com.tencent.mm.R.id.czc);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dbk);
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f369135b;
        if (emojiStatusView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
        } else if (emojiInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
        } else {
            if (!android.text.TextUtils.isEmpty(str)) {
                textView.setVisibility(0);
                textView.setText(java.lang.String.format(context.getResources().getString(com.tencent.mm.R.string.j5d), str));
            }
            emojiStatusView.setEmojiInfo(emojiInfo);
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.L = inflate;
            aVar.R = 1;
        }
        i0Var.f211821b.C = false;
        return this;
    }

    public r35.i1 g(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f369135b;
        i0Var.f211821b.f211716f = booleanValue;
        if (bool.booleanValue()) {
            i0Var.f211821b.f211714d = this.f369134a.getString(com.tencent.mm.R.string.f490938bb0);
        }
        return this;
    }

    public r35.i1 h(boolean z17) {
        this.f369135b.f211821b.C = z17;
        return this;
    }

    public r35.i1 i(java.lang.String str) {
        android.content.Context context = this.f369134a;
        i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f369135b.f211821b.f211730t = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, str.toString());
        }
        return this;
    }

    public r35.i1 j(int i17) {
        this.f369137d = this.f369134a.getResources().getString(i17);
        return this;
    }

    public void k() {
        this.f369136c.show();
    }

    public r35.i1 l(java.lang.Object obj) {
        android.content.Context context = this.f369134a;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f369135b;
        r35.j1.g(context, i0Var, obj);
        i0Var.f211821b.C = true;
        return this;
    }
}
