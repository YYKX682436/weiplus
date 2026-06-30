package lg5;

/* loaded from: classes15.dex */
public final class d extends android.text.SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f318586d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f318587e;

    public d(java.lang.Class cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.f318587e = new java.util.ArrayList();
        m3.h.d(cls, "watcherClass must not be null");
        this.f318586d = cls;
    }

    public final void a() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f318587e;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            ((lg5.c) ((java.util.ArrayList) list).get(i17)).f318585e.incrementAndGet();
            i17++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.Editable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final lg5.c b(java.lang.Object obj) {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f318587e;
            if (i17 >= list.size()) {
                return null;
            }
            lg5.c cVar = (lg5.c) list.get(i17);
            if (cVar.f318584d == obj) {
                return cVar;
            }
            i17++;
        }
    }

    public final boolean c(java.lang.Object obj) {
        if (obj != null) {
            return this.f318586d == obj.getClass();
        }
        return false;
    }

    public final void d() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f318587e;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            ((lg5.c) ((java.util.ArrayList) list).get(i17)).f318585e.decrementAndGet();
            i17++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.Editable delete(int i17, int i18) {
        super.delete(i17, i18);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        lg5.c b17;
        if (c(obj) && (b17 = b(obj)) != null) {
            obj = b17;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        lg5.c b17;
        if (c(obj) && (b17 = b(obj)) != null) {
            obj = b17;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        lg5.c b17;
        if (c(obj) && (b17 = b(obj)) != null) {
            obj = b17;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public java.lang.Object[] getSpans(int i17, int i18, java.lang.Class cls) {
        if (!(this.f318586d == cls)) {
            return super.getSpans(i17, i18, cls);
        }
        lg5.c[] cVarArr = (lg5.c[]) super.getSpans(i17, i18, lg5.c.class);
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, cVarArr.length);
        for (int i19 = 0; i19 < cVarArr.length; i19++) {
            objArr[i19] = cVarArr[i19].f318584d;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.Editable insert(int i17, java.lang.CharSequence charSequence) {
        super.insert(i17, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i17, int i18, java.lang.Class cls) {
        if (this.f318586d == cls) {
            cls = lg5.c.class;
        }
        return super.nextSpanTransition(i17, i18, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        lg5.c cVar;
        if (c(obj)) {
            cVar = b(obj);
            if (cVar != null) {
                obj = cVar;
            }
        } else {
            cVar = null;
        }
        super.removeSpan(obj);
        if (cVar != null) {
            ((java.util.ArrayList) this.f318587e).remove(cVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable replace(int i17, int i18, java.lang.CharSequence charSequence) {
        replace(i17, i18, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        if (c(obj)) {
            lg5.c cVar = new lg5.c(obj);
            ((java.util.ArrayList) this.f318587e).add(cVar);
            obj = cVar;
        }
        super.setSpan(obj, i17, i18, i19);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i17, int i18) {
        return new lg5.d(this.f318586d, this, i17, i18);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder delete(int i17, int i18) {
        super.delete(i17, i18);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int i17, java.lang.CharSequence charSequence) {
        super.insert(i17, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable replace(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27) {
        replace(i17, i18, charSequence, i19, i27);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.Editable insert(int i17, java.lang.CharSequence charSequence, int i18, int i19) {
        super.insert(i17, charSequence, i18, i19);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i17, int i18, java.lang.CharSequence charSequence) {
        a();
        super.replace(i17, i18, charSequence);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.Editable append(char c17) {
        super.append(c17);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int i17, java.lang.CharSequence charSequence, int i18, int i19) {
        super.insert(i17, charSequence, i18, i19);
        return this;
    }

    public d(java.lang.Class cls, java.lang.CharSequence charSequence, int i17, int i18) {
        super(charSequence, i17, i18);
        this.f318587e = new java.util.ArrayList();
        m3.h.d(cls, "watcherClass must not be null");
        this.f318586d = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(char c17) {
        super.append(c17);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public java.lang.Appendable append(char c17) {
        super.append(c17);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27) {
        a();
        super.replace(i17, i18, charSequence, i19, i27);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.Editable append(java.lang.CharSequence charSequence, int i17, int i18) {
        super.append(charSequence, i17, i18);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i17, int i18) {
        super.append(charSequence, i17, i18);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence, int i17, int i18) {
        super.append(charSequence, i17, i18);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i17) {
        super.append(charSequence, obj, i17);
        return this;
    }
}
