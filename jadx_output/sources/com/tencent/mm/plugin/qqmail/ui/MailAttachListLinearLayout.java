package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class MailAttachListLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f154891d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f154892e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154893f;

    public MailAttachListLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154892e = new java.util.ArrayList();
        this.f154891d = context;
    }

    public void setMailId(java.lang.String str) {
        this.f154893f = str;
    }
}
