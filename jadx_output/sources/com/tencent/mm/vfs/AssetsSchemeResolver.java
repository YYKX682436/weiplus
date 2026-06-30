package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class AssetsSchemeResolver extends com.tencent.mm.vfs.SingletonSchemeResolver {
    public static final com.tencent.mm.vfs.l CREATOR = new com.tencent.mm.vfs.l(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.AssetsSchemeResolver.AssetsFileSystem f212692d = new com.tencent.mm.vfs.AssetsSchemeResolver.AssetsFileSystem(com.tencent.mm.vfs.a3.f212781a.f212813d);

    /* loaded from: classes12.dex */
    public static final class AssetsFileSystem extends com.tencent.mm.vfs.a implements com.tencent.mm.vfs.FileSystem {
        public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.AssetsSchemeResolver.AssetsFileSystem> CREATOR = null;

        /* renamed from: e, reason: collision with root package name */
        public final android.content.res.AssetManager f212693e;

        public AssetsFileSystem(android.content.Context context) {
            this.f212693e = context.getAssets();
        }

        @Override // com.tencent.mm.vfs.q2
        public java.lang.Iterable C(java.lang.String str) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, false);
            try {
                java.lang.String[] list = this.f212693e.list(l17);
                if (list == null) {
                    return null;
                }
                return java.util.Arrays.asList(list);
            } catch (java.io.IOException e17) {
                com.tencent.stubs.logger.Log.e("VFS.AssetsFileSystem", e17, "Cannot list: " + l17);
                return null;
            }
        }

        @Override // com.tencent.mm.vfs.q2
        public java.lang.String D(java.lang.String str, boolean z17) {
            return null;
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean F(java.lang.String str) {
            try {
                a(str).close();
                return true;
            } catch (java.io.IOException unused) {
                return false;
            }
        }

        @Override // com.tencent.mm.vfs.a
        public long G(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
            throw new java.io.IOException("Not implemented");
        }

        @Override // com.tencent.mm.vfs.q2
        public java.io.InputStream a(java.lang.String str) {
            try {
                return this.f212693e.open(str);
            } catch (java.io.IOException e17) {
                if (e17 instanceof java.io.FileNotFoundException) {
                    throw ((java.io.FileNotFoundException) e17);
                }
                throw new java.io.FileNotFoundException(e17.getMessage());
            }
        }

        @Override // com.tencent.mm.vfs.a0
        public java.lang.Object b(java.util.Map map) {
            return this;
        }

        @Override // com.tencent.mm.vfs.q2
        public java.io.OutputStream c(java.lang.String str, boolean z17) {
            throw new java.io.FileNotFoundException("Cannot open files for writing on read-only filesystems");
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean d(java.lang.String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean e(java.lang.String str, boolean z17) {
            return false;
        }

        @Override // com.tencent.mm.vfs.q2
        public com.tencent.mm.vfs.o2 g(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.vfs.q2
        public java.lang.Iterable list(java.lang.String str) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, false);
            try {
                java.lang.String[] list = this.f212693e.list(l17);
                if (list == null) {
                    return null;
                }
                return new pm5.l(java.util.Arrays.asList(list), new com.tencent.mm.vfs.k(this, l17.isEmpty() ? l17 : l17.concat("/")), null, false);
            } catch (java.io.IOException e17) {
                com.tencent.stubs.logger.Log.e("VFS.AssetsFileSystem", e17, "Cannot list: " + l17);
                return null;
            }
        }

        @Override // com.tencent.mm.vfs.q2
        public com.tencent.mm.vfs.x1 m(java.lang.String str) {
            try {
                java.io.InputStream a17 = a(str);
                int available = a17.available();
                a17.close();
                int lastIndexOf = str.lastIndexOf(47);
                return new com.tencent.mm.vfs.x1(this, str, lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1), available, 0L, 0L, false);
            } catch (java.io.IOException unused) {
                return null;
            }
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean n(java.lang.String str, long j17) {
            return false;
        }

        @Override // com.tencent.mm.vfs.q2
        public int o() {
            return 12;
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean r(java.lang.String str) {
            return false;
        }

        @Override // com.tencent.mm.vfs.a
        public java.lang.String toString() {
            return "assets";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.tencent.mm.vfs.q2
        public com.tencent.mm.vfs.FileSystem y() {
            return this;
        }
    }

    public AssetsSchemeResolver(com.tencent.mm.vfs.j jVar) {
    }

    @Override // com.tencent.mm.vfs.s5
    public android.util.Pair a(com.tencent.mm.vfs.m5 m5Var, com.tencent.mm.vfs.z7 z7Var) {
        java.lang.String str = z7Var.f213279f;
        return android.util.Pair.create(this.f212692d, str == null ? "" : com.tencent.mm.vfs.e8.l(str, true, true));
    }
}
