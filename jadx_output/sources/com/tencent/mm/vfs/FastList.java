package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class FastList {

    /* loaded from: classes12.dex */
    public static class Result {
        public com.tencent.mm.vfs.FastList.TagSetResult[] tagSets;
        public int totalCount;
        public long totalSize;
    }

    /* loaded from: classes12.dex */
    public static class TagSet {
        public int mask;
        public int shift;
        public int slots;
    }

    /* loaded from: classes12.dex */
    public static class TagSetResult {
        public int[] counts;
        public long[] sizes;
        public com.tencent.mm.vfs.FastList.TagSet tagSet;
    }

    /* loaded from: classes12.dex */
    public static final class Tagger {
        public int andTag;
        public int depth;
        public int orTag;
        public java.lang.String path;
        public com.tencent.mm.vfs.FastList.TaggerPattern[] patterns;
        public boolean skip;

        public java.lang.String toString() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.path);
            sb6.append(" => {");
            if (this.skip) {
                sb6.append("skip}");
                return sb6.toString();
            }
            sb6.append("&:");
            sb6.append(java.lang.Integer.toHexString(this.andTag));
            sb6.append(", |:");
            sb6.append(java.lang.Integer.toHexString(this.orTag));
            sb6.append('}');
            if (this.depth > 0) {
                sb6.append(" [");
                sb6.append(this.depth);
                sb6.append(']');
            }
            return sb6.toString();
        }
    }

    /* loaded from: classes12.dex */
    public static final class TaggerPattern {
        public int andTag;
        public int orTag;
        public java.lang.String pattern;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void cancel(long j17, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void close(long j17);

    public static long d(java.util.List list) {
        return getDirSize((java.lang.String[]) list.toArray(new java.lang.String[0]), 2L);
    }

    public static long e(java.util.List list) {
        return getDirSize((java.lang.String[]) list.toArray(new java.lang.String[0]), 3L);
    }

    public static com.tencent.mm.vfs.w1 f(java.util.List list, com.tencent.mm.vfs.FastList.TagSet[] tagSetArr, java.util.List list2, boolean z17) {
        return new com.tencent.mm.vfs.w1(prepare((java.lang.String[]) list.toArray(new java.lang.String[0]), tagSetArr, (com.tencent.mm.vfs.FastList.Tagger[]) list2.toArray(new com.tencent.mm.vfs.FastList.Tagger[0]), z17), tagSetArr, null);
    }

    private static native long getDirSize(java.lang.String[] strArr, long j17);

    public static native long getDiskSpaceForPaths(java.lang.String... strArr);

    private static native long prepare(java.lang.String[] strArr, com.tencent.mm.vfs.FastList.TagSet[] tagSetArr, com.tencent.mm.vfs.FastList.Tagger[] taggerArr, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean run(long j17, com.tencent.mm.vfs.FastList.Result result, com.tencent.mm.vfs.FastList.TagSetResult[] tagSetResultArr, boolean z17);
}
