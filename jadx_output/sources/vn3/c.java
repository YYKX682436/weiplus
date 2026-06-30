package vn3;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438432b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f438433c;

    public c(int i17) {
        this.f438431a = "";
        this.f438433c = false;
        this.f438432b = i17;
        this.f438433c = false;
    }

    public java.lang.String toString() {
        return "NewTipsPath{dynamicPath='" + this.f438431a + "', path=" + this.f438432b + ", isDynamicPtch=" + this.f438433c + '}';
    }

    public c(java.lang.String str) {
        this.f438431a = "";
        this.f438433c = false;
        this.f438431a = str;
        this.f438433c = true;
    }
}
