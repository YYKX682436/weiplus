package com.tencent.mm.plugin.scanner.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010*\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/tencent/mm/plugin/scanner/model/ScanProductInfo;", "", "", "toString", "", "isText", "toDebugString", "toCopy", "copy", "Lcom/tencent/wechat/aff/iam_scan/y0;", "", "x1", "F", "getX1", "()F", "setX1", "(F)V", "x2", "getX2", "setX2", "y1", "getY1", "setY1", "y2", "getY2", "setY2", "prob", "getProb", "setProb", "", dm.i4.COL_ID, "I", "getId", "()I", "setId", "(I)V", "age", "getAge", "setAge", "hit", "getHit", "setHit", "classId", "getClassId", "setClassId", "shouldShow", "Z", "getShouldShow", "()Z", "setShouldShow", "(Z)V", "<init>", "()V", "Companion", "com/tencent/mm/plugin/scanner/model/x1", "scan-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ScanProductInfo {
    public static final int CLASS_ID_TEXT = 13;
    public static final com.tencent.mm.plugin.scanner.model.x1 Companion = new com.tencent.mm.plugin.scanner.model.x1(null);
    private int age;
    private int classId;
    private int hit;
    private int id;
    private float prob;
    private boolean shouldShow;
    private float x1;
    private float x2;
    private float y1;
    private float y2;

    public final com.tencent.mm.plugin.scanner.model.ScanProductInfo copy(com.tencent.mm.plugin.scanner.model.ScanProductInfo toCopy) {
        kotlin.jvm.internal.o.g(toCopy, "toCopy");
        this.x1 = toCopy.x1;
        this.x2 = toCopy.x2;
        this.y1 = toCopy.y1;
        this.y2 = toCopy.y2;
        this.prob = toCopy.prob;
        this.id = toCopy.id;
        this.age = toCopy.age;
        this.hit = toCopy.hit;
        this.classId = toCopy.classId;
        this.shouldShow = toCopy.shouldShow;
        return this;
    }

    public final int getAge() {
        return this.age;
    }

    public final int getClassId() {
        return this.classId;
    }

    public final int getHit() {
        return this.hit;
    }

    public final int getId() {
        return this.id;
    }

    public final float getProb() {
        return this.prob;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getY2() {
        return this.y2;
    }

    public final boolean isText() {
        return this.classId == 13;
    }

    public final void setAge(int i17) {
        this.age = i17;
    }

    public final void setClassId(int i17) {
        this.classId = i17;
    }

    public final void setHit(int i17) {
        this.hit = i17;
    }

    public final void setId(int i17) {
        this.id = i17;
    }

    public final void setProb(float f17) {
        this.prob = f17;
    }

    public final void setShouldShow(boolean z17) {
        this.shouldShow = z17;
    }

    public final void setX1(float f17) {
        this.x1 = f17;
    }

    public final void setX2(float f17) {
        this.x2 = f17;
    }

    public final void setY1(float f17) {
        this.y1 = f17;
    }

    public final void setY2(float f17) {
        this.y2 = f17;
    }

    public final java.lang.String toDebugString() {
        return "shouldShow: " + this.shouldShow + "\nlocation: " + this.x1 + ", " + this.y1 + ", " + this.x2 + ", " + this.y2 + "\nprob: " + this.prob + "\ntrackId: " + this.id + "\nage: " + this.age + "\nhit: " + this.hit + "\nclassId: " + this.classId + '\n';
    }

    public java.lang.String toString() {
        return "ScanProductInfo: (" + this.x1 + ", " + this.y1 + "), (" + this.x2 + ", " + this.y2 + "), isText=" + isText() + ", prob=" + this.prob + ", id=" + this.id + ", age=" + this.age + ", hit=" + this.hit + ", classId: " + this.classId + ", shouldShow=" + this.shouldShow;
    }

    public final com.tencent.mm.plugin.scanner.model.ScanProductInfo copy(com.tencent.wechat.aff.iam_scan.y0 toCopy) {
        kotlin.jvm.internal.o.g(toCopy, "toCopy");
        this.x1 = toCopy.f217183d;
        this.x2 = toCopy.f217185f;
        this.y1 = toCopy.f217184e;
        this.y2 = toCopy.f217186g;
        this.prob = toCopy.f217187h;
        this.id = toCopy.f217188i;
        this.age = toCopy.f217189m;
        this.hit = toCopy.f217190n;
        this.classId = toCopy.f217191o;
        this.shouldShow = toCopy.f217192p;
        return this;
    }
}
