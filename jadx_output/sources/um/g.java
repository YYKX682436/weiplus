package um;

/* loaded from: classes10.dex */
public class g implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f428681d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f428682e;

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f428681d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f428682e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        if (!z17) {
            xk0.f g17 = g();
            if (g17 == null || g17.s()) {
                return;
            }
            g17.i(canvas);
            return;
        }
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        java.util.Iterator it = this.f428681d.iterator();
        while (it.hasNext()) {
            xk0.f fVar = (xk0.f) it.next();
            if (!fVar.s()) {
                fVar.i(canvas);
            }
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f428681d.iterator();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "onFinalGenerate: count=%d", java.lang.Integer.valueOf(this.f428681d.size()));
        while (it.hasNext()) {
            xk0.f fVar = (xk0.f) it.next();
            fVar.w(false);
            fVar.i(canvas);
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[%s] [onSave] size:%s isExit:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f428681d.size()), java.lang.Boolean.valueOf(z17));
        java.util.Stack stack = this.f428682e;
        if (stack != null) {
            stack.clear();
        }
        this.f428682e = new java.util.Stack();
        java.util.Iterator it = this.f428681d.iterator();
        while (it.hasNext()) {
            this.f428682e.push(((xk0.f) it.next()).clone());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[%s] [onSave] mCurStack size:%s, mLastStack size:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f428681d.size()), java.lang.Integer.valueOf(this.f428682e.size()));
        if (z17) {
            this.f428681d.clear();
            java.util.Iterator it6 = this.f428682e.iterator();
            while (it6.hasNext()) {
                ((xk0.f) it6.next()).t();
            }
        }
    }

    @Override // um.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(xk0.f fVar) {
        java.util.Stack stack = this.f428681d;
        if (stack != null) {
            stack.push(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "add item %s", fVar);
        }
    }

    public xk0.f b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[delete] id:%s", str);
        java.util.Stack stack = this.f428681d;
        if (stack != null && stack.size() > 0) {
            xk0.f fVar = (xk0.f) this.f428681d.peek();
            if (fVar.q().equalsIgnoreCase(str)) {
                this.f428681d.pop();
                return fVar;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiAndTextCache", "[delete] id:%s emojiItem:%s", str, fVar);
        }
        return null;
    }

    public int[] c(boolean z17) {
        int[] iArr = new int[2];
        if (z17) {
            java.util.Iterator it = this.f428681d.iterator();
            while (it.hasNext()) {
                if (((xk0.f) it.next()) instanceof xk0.p) {
                    iArr[1] = iArr[1] + 1;
                } else {
                    iArr[0] = iArr[0] + 1;
                }
            }
        } else {
            java.util.Stack stack = this.f428682e;
            if (stack != null) {
                java.util.Iterator it6 = stack.iterator();
                while (it6.hasNext()) {
                    if (((xk0.f) it6.next()) instanceof xk0.p) {
                        iArr[1] = iArr[1] + 1;
                    } else {
                        iArr[0] = iArr[0] + 1;
                    }
                }
            }
        }
        return iArr;
    }

    @Override // um.m
    public void clear() {
        if (this.f428681d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "clear: ");
            this.f428681d.clear();
        }
    }

    public java.lang.String[] d(boolean z17, java.lang.String str) {
        java.lang.String[] strArr = {"", ""};
        if (z17) {
            java.util.Iterator it = this.f428681d.iterator();
            while (it.hasNext()) {
                xk0.f fVar = (xk0.f) it.next();
                if (fVar instanceof xk0.p) {
                    strArr[1] = strArr[1] + ((xk0.p) fVar).E.toString() + str;
                } else {
                    strArr[0] = strArr[0] + fVar.f454951f.getMd5() + str;
                }
            }
        } else {
            java.util.Stack stack = this.f428682e;
            if (stack != null) {
                java.util.Iterator it6 = stack.iterator();
                while (it6.hasNext()) {
                    xk0.f fVar2 = (xk0.f) it6.next();
                    if (fVar2 instanceof xk0.p) {
                        strArr[1] = strArr[1] + ((xk0.p) fVar2).E.toString() + str;
                    } else {
                        strArr[0] = strArr[0] + fVar2.f454951f.getMd5() + str;
                    }
                }
            }
        }
        return strArr;
    }

    public java.util.Stack e(boolean z17) {
        return z17 ? this.f428681d : this.f428682e;
    }

    public java.util.ListIterator f() {
        java.util.Stack stack = this.f428681d;
        return stack.listIterator(stack.size());
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[%s] [onRestore] size:%s isExit:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f428681d.size()), java.lang.Boolean.valueOf(z17));
        this.f428681d.clear();
        java.util.Stack stack = this.f428682e;
        if (stack != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f428681d.addAll(this.f428682e);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[%s] [onRestore] mCurStack size:%s ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f428681d.size()));
        if (z17) {
            java.util.Iterator it = this.f428681d.iterator();
            while (it.hasNext()) {
                ((xk0.f) it.next()).t();
            }
            java.util.Stack stack2 = this.f428682e;
            if (stack2 != null) {
                stack2.clear();
                return;
            }
            return;
        }
        java.util.Iterator it6 = this.f428681d.iterator();
        while (it6.hasNext()) {
            xk0.f fVar = (xk0.f) it6.next();
            android.graphics.Bitmap bitmap = fVar.f454952g;
            if (bitmap == null || bitmap.isRecycled()) {
                fVar.f454952g = fVar.j(fVar.p());
            }
        }
    }

    public xk0.f g() {
        java.util.Stack stack = this.f428681d;
        if (stack == null || stack.size() <= 0) {
            return null;
        }
        return (xk0.f) this.f428681d.peek();
    }

    public void h(java.lang.String str) {
        java.util.Iterator it = this.f428681d.iterator();
        while (it.hasNext()) {
            if (((xk0.f) it.next()).f454966x.equals(str)) {
                it.remove();
            }
        }
    }

    public void i(xk0.f fVar) {
        if (fVar == null) {
            return;
        }
        int indexOf = this.f428681d.indexOf(fVar);
        this.f428681d.remove(indexOf);
        this.f428681d.push(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "updateSelectedItem index:%s, item:%s", java.lang.Integer.valueOf(indexOf), fVar);
    }

    @Override // um.m
    public void o5() {
    }

    @Override // um.m
    public void onCreate() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.EmojiAndTextCache", "[%s] [onCreate]", java.lang.Integer.valueOf(hashCode()));
        this.f428681d = new java.util.Stack();
    }

    @Override // um.m
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "[onDestroy]");
        java.util.Stack stack = this.f428681d;
        if (stack != null) {
            java.util.Iterator it = stack.iterator();
            while (it.hasNext()) {
                ((xk0.f) it.next()).clear();
            }
            this.f428681d.clear();
        }
        java.util.Stack stack2 = this.f428682e;
        if (stack2 != null) {
            java.util.Iterator it6 = stack2.iterator();
            while (it6.hasNext()) {
                ((xk0.f) it6.next()).clear();
            }
            this.f428682e.clear();
        }
    }

    @Override // um.m
    public java.lang.Object pop() {
        xk0.f fVar = (xk0.f) this.f428681d.pop();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "pop item %s", fVar);
        return fVar;
    }
}
