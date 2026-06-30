package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f191804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191806f;

    /* renamed from: g, reason: collision with root package name */
    public int f191807g;

    /* renamed from: h, reason: collision with root package name */
    public int f191808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.r4 f191809i;

    public o4(com.tencent.mm.pluginsdk.ui.tools.r4 r4Var, com.tencent.mm.pluginsdk.ui.tools.g4 g4Var) {
        this.f191809i = r4Var;
    }

    public final android.graphics.Bitmap a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (this.f191808h <= 0 || this.f191807g <= 0) {
            java.util.Vector vector = x51.w0.f452103a;
            return x51.v0.b(str);
        }
        this.f191809i.getClass();
        java.lang.String str2 = str + "_" + this.f191807g + "_" + this.f191808h;
        int i17 = this.f191807g;
        int i18 = this.f191808h;
        java.util.Vector vector2 = x51.w0.f452103a;
        android.graphics.Bitmap d17 = x51.v0.d(str2, i17, i18);
        if (d17 != null) {
            return d17;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        android.graphics.Bitmap T = (90 == a17 || 270 == a17) ? com.tencent.mm.sdk.platformtools.x.T(str, this.f191807g, this.f191808h, true) : com.tencent.mm.sdk.platformtools.x.T(str, this.f191808h, this.f191807g, true);
        if (T == null) {
            return T;
        }
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
        try {
            com.tencent.mm.sdk.platformtools.x.D0(w07, 100, android.graphics.Bitmap.CompressFormat.PNG, str2, false);
            return w07;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImageEngine", e17, "", new java.lang.Object[0]);
            return w07;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f191809i.f191864a) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageEngine", "on load image jog, isQuit, return");
            return;
        }
        synchronized (this.f191809i.f191865b) {
            if (this.f191809i.f191868e.get(this.f191806f) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageEngine", "check before decode, no match wait to render view, renderKey is %s, return", this.f191806f);
                return;
            }
            android.graphics.Bitmap bitmap = null;
            if (this.f191804d != null) {
                int i17 = 0;
                while (true) {
                    java.lang.String[] strArr = this.f191804d;
                    if (i17 >= strArr.length) {
                        break;
                    }
                    if (i17 == 0) {
                        bitmap = a(strArr[0]);
                        if (bitmap != null) {
                            this.f191809i.f191870g.put(this.f191806f, bitmap);
                            break;
                        }
                        i17++;
                    } else {
                        java.lang.String c17 = com.tencent.mm.pluginsdk.ui.tools.r4.c(strArr[i17], this.f191805e, this.f191807g, this.f191808h);
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f191809i.f191870g.get(c17);
                        if (bitmap2 == null) {
                            bitmap2 = a(this.f191804d[i17]);
                        }
                        if (bitmap2 != null) {
                            this.f191809i.f191870g.put(c17, bitmap2);
                            bitmap = bitmap2;
                            break;
                        } else {
                            bitmap = bitmap2;
                            i17++;
                        }
                    }
                }
            }
            if (bitmap == null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f191805e) && (bitmap = x51.w0.d(this.f191809i.d(this.f191806f, this.f191805e, this.f191807g, this.f191808h))) != null) {
                this.f191809i.f191870g.put(this.f191806f, bitmap);
            }
            if (bitmap != null) {
                synchronized (this.f191809i.f191865b) {
                    android.widget.ImageView imageView = (android.widget.ImageView) this.f191809i.f191868e.get(this.f191806f);
                    if (imageView != null) {
                        this.f191809i.f191869f.remove(imageView);
                        com.tencent.mm.pluginsdk.ui.tools.n4 n4Var = this.f191809i.f191872i;
                        java.util.LinkedList linkedList = n4Var.f191791b;
                        com.tencent.mm.pluginsdk.ui.tools.q4 q4Var = (com.tencent.mm.pluginsdk.ui.tools.q4) (linkedList.isEmpty() ? n4Var.a() : linkedList.removeFirst());
                        q4Var.f191851d = imageView;
                        q4Var.f191852e = bitmap;
                        this.f191809i.f191867d.post(q4Var);
                    }
                    this.f191809i.f191868e.remove(this.f191806f);
                }
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f191809i.f191873j.f191792c;
            n3Var.sendMessage(n3Var.obtainMessage(1, this));
        }
    }
}
